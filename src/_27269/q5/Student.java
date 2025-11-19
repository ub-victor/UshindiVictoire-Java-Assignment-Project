package _27269.q5;

public class Student extends Instructor {
    private String studentName;
    private String studentID; // note: can be string
    private int age; // >0

    public Student(int id, String createdDate, String updatedDate,
                   String institutionName, String code, String address,
                   String departmentName, String departmentHead,
                   String courseName, String courseCode, int credits,
                   String instructorName, String email, String phone,
                   String studentName, String studentID, int age) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits, instructorName, email, phone);
        if (studentName == null || studentName.trim().isEmpty()) throw new IllegalArgumentException("studentName required");
        if (studentID == null || studentID.trim().isEmpty()) throw new IllegalArgumentException("studentID required");
        if (age <= 0) throw new IllegalArgumentException("age must be > 0");
        this.studentName = studentName;
        this.studentID = studentID;
        this.age = age;
    }

    public String getStudentName() { return studentName; }
    public String getStudentID() { return studentID; }
    public int getAge() { return age; }
}
