package _27269.q5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Interactive runner for Q5 Attendance Management System.
 *
 * Run:
 *   javac src/_27269/q5/*.java
 *   java -cp src _27269.q5.Q5App
 */
public class Q5App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("27269 - Welcome to Q5: Attendance Management interactive runner.");

            System.out.print("27269 - Enter entity id (>0): ");
            int id = Integer.parseInt(sc.nextLine().trim());

            System.out.print("27269 - Created date (YYYY-MM-DD): ");
            String created = sc.nextLine().trim();

            System.out.print("27269 - Updated date (YYYY-MM-DD): ");
            String updated = sc.nextLine().trim();

            System.out.print("27269 - Institution name: ");
            String instName = sc.nextLine().trim();

            System.out.print("27269 - Institution code (>=3): ");
            String instCode = sc.nextLine().trim();

            System.out.print("27269 - Institution address: ");
            String instAddr = sc.nextLine().trim();

            System.out.print("27269 - Department name: ");
            String deptName = sc.nextLine().trim();

            System.out.print("27269 - Department head: ");
            String deptHead = sc.nextLine().trim();

            System.out.print("27269 - Course name: ");
            String courseName = sc.nextLine().trim();

            System.out.print("27269 - Course code: ");
            String courseCode = sc.nextLine().trim();

            System.out.print("27269 - Course credits (>0): ");
            int credits = Integer.parseInt(sc.nextLine().trim());

            System.out.print("27269 - Instructor name: ");
            String instrName = sc.nextLine().trim();

            System.out.print("27269 - Instructor email: ");
            String instrEmail = sc.nextLine().trim();

            System.out.print("27269 - Instructor phone (10 digits): ");
            String instrPhone = sc.nextLine().trim();

            System.out.print("27269 - How many class sessions to record? ");
            int sessionsToRecord = Integer.parseInt(sc.nextLine().trim());

            int grandTotalPresent = 0;
            int grandTotalAbsent = 0;
            int totalSessions = sessionsToRecord;

            // We'll collect attendance per session
            List<AttendanceRecord> records = new ArrayList<>();
            List<LeaveRequest> leaves = new ArrayList<>();

            for (int s = 1; s <= sessionsToRecord; s++) {
                System.out.println("27269 - --- Session " + s + " ---");
                System.out.print("27269 - Session date (YYYY-MM-DD): ");
                String sDate = sc.nextLine().trim();
                System.out.print("27269 - Topic: ");
                String topic = sc.nextLine().trim();

                System.out.print("27269 - How many students to record for this session? ");
                int students = Integer.parseInt(sc.nextLine().trim());

                for (int i = 1; i <= students; i++) {
                    System.out.println("27269 - Student #" + i);
                    System.out.print("  27269 - Student name: ");
                    String sName = sc.nextLine().trim();
                    System.out.print("  27269 - Student ID: ");
                    String sId = sc.nextLine().trim();
                    System.out.print("  27269 - Age (>0): ");
                    int age = Integer.parseInt(sc.nextLine().trim());
                    System.out.print("  27269 - Attendance status (Present/Absent): ");
                    String status = sc.nextLine().trim();

                    AttendanceRecord ar = new AttendanceRecord(
                        id, created, updated,
                        instName, instCode, instAddr,
                        deptName, deptHead,
                        courseName, courseCode, credits,
                        instrName, instrEmail, instrPhone,
                        sName, sId, age,
                        sDate, topic,
                        sId, "S" + s + "R" + i, status
                    );
                    records.add(ar);
                    if (status.equalsIgnoreCase("Present")) grandTotalPresent++;
                    else grandTotalAbsent++;

                    // Optionally capture leave request if student absent
                    if (status.equalsIgnoreCase("Absent")) {
                        System.out.print("  27269 - Does this student have a leave request? (yes/no): ");
                        String hasLeave = sc.nextLine().trim();
                        if (hasLeave.equalsIgnoreCase("yes")) {
                            System.out.print("    27269 - Request date: ");
                            String rDate = sc.nextLine().trim();
                            System.out.print("    27269 - Reason: ");
                            String reason = sc.nextLine().trim();
                            System.out.print("    27269 - Approved? (true/false): ");
                            boolean approved = Boolean.parseBoolean(sc.nextLine().trim());
                            LeaveRequest lr = new LeaveRequest(
                                id, created, updated,
                                instName, instCode, instAddr,
                                deptName, deptHead,
                                courseName, courseCode, credits,
                                instrName, instrEmail, instrPhone,
                                sName, sId, age,
                                sDate, topic,
                                sId, "S" + s + "R" + i, status,
                                rDate, reason, approved
                            );
                            leaves.add(lr);
                        }
                    }
                }
            }

            // Build an AttendanceSummary object — we must provide sample values for the constructor chain params
            // We'll use the last recorded student's details (or placeholders if none).
            String sampleStudentName = records.isEmpty() ? "N/A" : records.get(0).getStudentName();
            String sampleStudentID = records.isEmpty() ? "N/A" : records.get(0).getStudentID();
            int sampleAge = records.isEmpty() ? 1 : records.get(0).getAge();
            String sampleSessionDate = (records.isEmpty()) ? java.time.LocalDate.now().toString() : records.get(0).getSessionDate();
            String sampleTopic = (records.isEmpty()) ? "N/A" : records.get(0).getTopic();
            String sampleStatus = (records.isEmpty()) ? "Present" : records.get(0).getStatus();

            AttendanceSummary summary = new AttendanceSummary(
                id, created, updated,
                instName, instCode, instAddr,
                deptName, deptHead,
                courseName, courseCode, credits,
                instrName, instrEmail, instrPhone,
                sampleStudentName, sampleStudentID, sampleAge,
                sampleSessionDate, sampleTopic,
                sampleStudentID, "SUMMARY", sampleStatus,
                java.time.LocalDate.now().toString(), "N/A", true,
                java.time.LocalDate.now().toString(),
                grandTotalPresent, grandTotalAbsent, totalSessions
            );

            // Display all inserted data (requirement: display all inserted data)
            String p = "27269 - ";
            System.out.println(p + "=== All Attendance Records ===");
            for (AttendanceRecord r : records) {
                System.out.println(p + "Student: " + r.getStudentName() + " | ID: " + r.getStudentIdRef() + " | Session: " + r.getSessionDate() + " | Topic: " + r.getTopic() + " | Status: " + r.getStatus());
            }
            if (!leaves.isEmpty()) {
                System.out.println(p + "=== Leave Requests ===");
                for (LeaveRequest lr : leaves) {
                    System.out.println(p + "Student: " + lr.getStudentName() + " | Request Date: " + lr.getRequestDate() + " | Reason: " + lr.getReason() + " | Approved: " + lr.isApproved());
                }
            }

            // Print summary (prefixes student id internally)
            summary.generateSummary();

            System.out.println("27269 - Q5 interactive session completed.");

        } catch (Exception ex) {
            System.out.println("27269 - ERROR: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
