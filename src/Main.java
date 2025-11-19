import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("27269 - UshindiVictoire Assignment Runner");
        System.out.println("====================================");
        System.out.println("Choose a question to run:");
        System.out.println("1. Q1 - Inventory Management System");
        System.out.println("2. Q2 - Duplicate Inventory System");
        System.out.println("3. Q3 - Tax Administration");
        System.out.println("4. Q4 - Procurement Management");
        System.out.println("5. Q5 - Attendance Management");
        System.out.println("6. Q6 - Payroll / RSSB System");
        System.out.println("====================================");
        System.out.print("Enter option (1-6): ");

        int opt = Integer.parseInt(sc.nextLine());

        try {
            switch (opt) {
                case 1:
                    System.out.println("27269 - Running Q1...");
                    _27269.q1.Q1App.main(null);
                    break;

                case 2:
                    System.out.println("27269 - Running Q2...");
                    _27269.q2.Q2App.main(null);
                    break;

                case 3:
                    System.out.println("27269 - Running Q3...");
                    _27269.q3.Q3App.main(null);
                    break;

                case 4:
                    System.out.println("27269 - Running Q4...");
                    _27269.q4.Q4App.main(null);
                    break;

                case 5:
                    System.out.println("27269 - Running Q5...");
                    _27269.q5.Q5App.main(null);
                    break;

                case 6:
                    System.out.println("27269 - Running Q6...");
                    _27269.q6.Q6App.main(null);
                    break;

                default:
                    System.out.println("27269 - Invalid option.");
            }

        } catch (Exception e) {
            System.out.println("27269 - ERROR in Main: " + e.getMessage());
        }

        sc.close();
    }
}
