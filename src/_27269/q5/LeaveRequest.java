package _27269.q5;

public class LeaveRequest extends AttendanceRecord {
    private String requestDate;
    private String reason;
    private boolean approved;

    public LeaveRequest(int id, String createdDate, String updatedDate,
                        String institutionName, String code, String address,
                        String departmentName, String departmentHead,
                        String courseName, String courseCode, int credits,
                        String instructorName, String email, String phone,
                        String studentName, String studentID, int age,
                        String sessionDate, String topic,
                        String studentIdRef, String sessionId, String status,
                        String requestDate, String reason, boolean approved) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits, instructorName, email, phone, studentName, studentID, age, sessionDate, topic, studentIdRef, sessionId, status);
        if (requestDate == null || requestDate.trim().isEmpty()) throw new IllegalArgumentException("requestDate required");
        if (reason == null || reason.trim().isEmpty()) throw new IllegalArgumentException("reason required");
        this.requestDate = requestDate;
        this.reason = reason;
        this.approved = approved;
    }

    public String getRequestDate() { return requestDate; }
    public String getReason() { return reason; }
    public boolean isApproved() { return approved; }
}
