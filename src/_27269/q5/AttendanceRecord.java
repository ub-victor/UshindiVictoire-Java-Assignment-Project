package _27269.q5;

public class AttendanceRecord extends ClassSession {
    private String studentIdRef; // which student the record is for
    private String sessionId;    // session identifier
    private String status;       // Present/Absent

    public AttendanceRecord(int id, String createdDate, String updatedDate,
                            String institutionName, String code, String address,
                            String departmentName, String departmentHead,
                            String courseName, String courseCode, int credits,
                            String instructorName, String email, String phone,
                            String studentName, String studentID, int age,
                            String sessionDate, String topic,
                            String studentIdRef, String sessionId, String status) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits, instructorName, email, phone, studentName, studentID, age, sessionDate, topic);
        if (studentIdRef == null || studentIdRef.trim().isEmpty()) throw new IllegalArgumentException("studentIdRef required");
        if (sessionId == null || sessionId.trim().isEmpty()) throw new IllegalArgumentException("sessionId required");
        if (status == null || !(status.equalsIgnoreCase("Present") || status.equalsIgnoreCase("Absent"))) throw new IllegalArgumentException("status must be Present or Absent");
        this.studentIdRef = studentIdRef;
        this.sessionId = sessionId;
        this.status = status.substring(0,1).toUpperCase() + status.substring(1).toLowerCase();
    }

    public String getStudentIdRef() { return studentIdRef; }
    public String getSessionId() { return sessionId; }
    public String getStatus() { return status; }
}
