package _27269.q5;

public class ClassSession extends Student {
    private String sessionDate;
    private String topic;

    public ClassSession(int id, String createdDate, String updatedDate,
                        String institutionName, String code, String address,
                        String departmentName, String departmentHead,
                        String courseName, String courseCode, int credits,
                        String instructorName, String email, String phone,
                        String studentName, String studentID, int age,
                        String sessionDate, String topic) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits, instructorName, email, phone, studentName, studentID, age);
        if (sessionDate == null || sessionDate.trim().isEmpty()) throw new IllegalArgumentException("sessionDate required");
        if (topic == null || topic.trim().isEmpty()) throw new IllegalArgumentException("topic required");
        this.sessionDate = sessionDate;
        this.topic = topic;
    }

    public String getSessionDate() { return sessionDate; }
    public String getTopic() { return topic; }
}
