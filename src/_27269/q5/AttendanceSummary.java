package _27269.q5;

public final class AttendanceSummary extends LeaveRequest {
    private String reportDate;
    private int totalPresent;
    private int totalAbsent;
    private int totalSessions;

    public AttendanceSummary(int id, String createdDate, String updatedDate,
                             String institutionName, String code, String address,
                             String departmentName, String departmentHead,
                             String courseName, String courseCode, int credits,
                             String instructorName, String email, String phone,
                             String studentName, String studentID, int age,
                             String sessionDate, String topic,
                             String studentIdRef, String sessionId, String status,
                             String requestDate, String reason, boolean approved,
                             String reportDate, int totalPresent, int totalAbsent, int totalSessions) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits, instructorName, email, phone, studentName, studentID, age, sessionDate, topic, studentIdRef, sessionId, status, requestDate, reason, approved);
        if (reportDate == null || reportDate.trim().isEmpty()) throw new IllegalArgumentException("reportDate required");
        if (totalPresent < 0 || totalAbsent < 0 || totalSessions < 0) throw new IllegalArgumentException("totals must be >= 0");
        this.reportDate = reportDate;
        this.totalPresent = totalPresent;
        this.totalAbsent = totalAbsent;
        this.totalSessions = totalSessions;
    }

    /**
     * generateSummary() = totalPresent / totalSessions × 100
     * prints formatted summary lines prefixed with student ID
     */
    public void generateSummary() {
        String p = "27269 - ";
        System.out.println(p + "----- ATTENDANCE SUMMARY -----");
        System.out.println(p + "Report Date: " + reportDate);
        System.out.println(p + "Institution: " + getInstitutionName() + " (" + getCode() + ")");
        System.out.println(p + "Department: " + getDepartmentName());
        System.out.println(p + "Course: " + getCourseName() + " (" + getCourseCode() + "), Credits: " + getCredits());
        System.out.println(p + "Instructor: " + getInstructorName() + " Contact: " + getEmail());
        System.out.println(p + "Total Sessions: " + totalSessions);
        System.out.println(p + "Total Present: " + totalPresent);
        System.out.println(p + "Total Absent: " + totalAbsent);
        double percent = (totalSessions == 0) ? 0.0 : ((double) totalPresent / (double) totalSessions) * 100.0;
        System.out.printf(p + "Attendance Rate: %.2f%%\n", percent);
        System.out.println(p + "-------------------------------");
    }

    public String getReportDate() { return reportDate; }
    public int getTotalPresent() { return totalPresent; }
    public int getTotalAbsent() { return totalAbsent; }
    public int getTotalSessions() { return totalSessions; }
}
