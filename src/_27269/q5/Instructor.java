package _27269.q5;

public class Instructor extends Course {
    private String instructorName;
    private String email;
    private String phone; // 10-digit

    public Instructor(int id, String createdDate, String updatedDate,
                      String institutionName, String code, String address,
                      String departmentName, String departmentHead,
                      String courseName, String courseCode, int credits,
                      String instructorName, String email, String phone) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits);
        if (instructorName == null || instructorName.trim().isEmpty()) throw new IllegalArgumentException("instructorName required");
        if (!isValidEmail(email)) throw new IllegalArgumentException("invalid email");
        if (!isValidPhone(phone)) throw new IllegalArgumentException("phone must be 10 digits");
        this.instructorName = instructorName;
        this.email = email;
        this.phone = phone;
    }

    private boolean isValidEmail(String e) {
        return e != null && e.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
    }

    private boolean isValidPhone(String p) {
        return p != null && p.matches("\\d{10}");
    }

    public String getInstructorName() { return instructorName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
}
