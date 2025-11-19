package _27269.q6;

import java.util.Scanner;

public class Q6App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("27269 - Welcome to Q6 Payroll System");

            System.out.print("27269 - Enter ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("27269 - Created date: ");
            String created = sc.nextLine();

            System.out.print("27269 - Updated date: ");
            String updated = sc.nextLine();

            System.out.print("27269 - Employee name: ");
            String name = sc.nextLine();

            System.out.print("27269 - Employee TIN (9 digits): ");
            String tin = sc.nextLine();

            System.out.print("27269 - Department: ");
            String dept = sc.nextLine();

            System.out.print("27269 - Contract type (Fixed/Permanent): ");
            String ctype = sc.nextLine();

            System.out.print("27269 - Start date: ");
            String start = sc.nextLine();

            System.out.print("27269 - End date: ");
            String end = sc.nextLine();

            System.out.print("27269 - Position name: ");
            String pos = sc.nextLine();

            System.out.print("27269 - Base salary: ");
            double base = Double.parseDouble(sc.nextLine());

            System.out.print("27269 - Grade name: ");
            String gname = sc.nextLine();

            System.out.print("27269 - Grade multiplier (>0): ");
            double mult = Double.parseDouble(sc.nextLine());

            System.out.print("27269 - Housing allowance: ");
            double hAllow = Double.parseDouble(sc.nextLine());

            System.out.print("27269 - Transport allowance: ");
            double tAllow = Double.parseDouble(sc.nextLine());

            System.out.print("27269 - Other allowance: ");
            double oAllow = Double.parseDouble(sc.nextLine());

            System.out.print("27269 - RSSB deduction: ");
            double rssb = Double.parseDouble(sc.nextLine());

            System.out.print("27269 - RRA deduction: ");
            double rra = Double.parseDouble(sc.nextLine());

            System.out.print("27269 - Other deductions: ");
            double oDeductions = Double.parseDouble(sc.nextLine());

            System.out.print("27269 - Month: ");
            String month = sc.nextLine();

            System.out.print("27269 - Working days (>0): ");
            int wdays = Integer.parseInt(sc.nextLine());

            System.out.print("27269 - Payslip number: ");
            String pno = sc.nextLine();

            Payslip slip = new Payslip(
               id, created, updated,
               name, tin, dept,
               ctype, start, end,
               pos, base,
               gname, mult,
               hAllow, tAllow, oAllow,
               rssb, rra, oDeductions,
               month, wdays,
               pno
            );

            slip.printPayslip();
            System.out.println("27269 - Q6 interactive session done.");

        } catch (Exception e) {
            System.out.println("27269 - ERROR: " + e.getMessage());
        }

        sc.close();
    }
}
