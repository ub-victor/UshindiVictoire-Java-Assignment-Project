package _27269.q5;

public class Course extends Department {
    private String courseName;
    private String courseCode;
    private int credits; // >0

    public Course(int id, String createdDate, String updatedDate,
                  String institutionName, String code, String address,
                  String departmentName, String departmentHead,
                  String courseName, String courseCode, int credits) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead);
        if (courseName == null || courseName.trim().isEmpty()) throw new IllegalArgumentException("courseName required");
        if (courseCode == null || courseCode.trim().isEmpty()) throw new IllegalArgumentException("courseCode required");
        if (credits <= 0) throw new IllegalArgumentException("credits must be > 0");
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
    }

    public String getCourseName() { return courseName; }
    public String getCourseCode() { return courseCode; }
    public int getCredits() { return credits; }
}
