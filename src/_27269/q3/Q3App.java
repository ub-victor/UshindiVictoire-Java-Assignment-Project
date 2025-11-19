package _27269.q3;

import java.util.Scanner;

public class Q3App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("27269 - Welcome to Q3: Tax Administration Interactive Runner");

            System.out.print("27269 - Enter ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("27269 - Created date: ");
            String created = sc.nextLine();

            System.out.print("27269 - Updated date: ");
            String updated = sc.nextLine();

            System.out.print("27269 - Authority name: ");
            String authName = sc.nextLine();

            System.out.print("27269 - Region: ");
            String region = sc.nextLine();

            System.out.print("27269 - Authority email: ");
            String authEmail = sc.nextLine();

            System.out.print("27269 - Tax category name: ");
            String catName = sc.nextLine();

            System.out.print("27269 - Tax rate (>0): ");
            double rate = Double.parseDouble(sc.nextLine());

            System.out.print("27269 - Category code (>=3 chars): ");
            String catCode = sc.nextLine();

            System.out.print("27269 - Taxpayer TIN (9 digits): ");
            String tin = sc.nextLine();

            System.out.print("27269 - Taxpayer name: ");
            String taxpayerName = sc.nextLine();

            System.out.print("27269 - Taxpayer address: ");
            String address = sc.nextLine();

            System.out.print("27269 - Employer name: ");
            String employerName = sc.nextLine();

            System.out.print("27269 - Employer TIN (9 digits): ");
            String empTIN = sc.nextLine();

            System.out.print("27269 - Employer contact (10 digits): ");
            String empContact = sc.nextLine();

            System.out.print("27269 - Employee name: ");
            String employeeName = sc.nextLine();

            System.out.print("27269 - Employee salary (>0): ");
            double salary = Double.parseDouble(sc.nextLine());

            System.out.print("27269 - Employee TIN (9 digits): ");
            String employeeTIN = sc.nextLine();

            System.out.print("27269 - Declaration month: ");
            String month = sc.nextLine();

            System.out.print("27269 - Total declared income: ");
            double income = Double.parseDouble(sc.nextLine());

            System.out.print("27269 - Assessment date: ");
            String assessDate = sc.nextLine();

            System.out.print("27269 - Assessed tax (>=0): ");
            double assessedTax = Double.parseDouble(sc.nextLine());

            System.out.print("27269 - Payment date: ");
            String paymentDate = sc.nextLine();

            System.out.print("27269 - Payment amount (>0): ");
            double paymentAmount = Double.parseDouble(sc.nextLine());

            System.out.print("27269 - Receipt number: ");
            String receipt = sc.nextLine();

            TaxRecord rec = new TaxRecord(
                    id, created, updated,
                    authName, region, authEmail,
                    catName, rate, catCode,
                    tin, taxpayerName, address,
                    employerName, empTIN, empContact,
                    employeeName, salary, employeeTIN,
                    month, income,
                    assessDate, assessedTax,
                    paymentDate, paymentAmount,
                    receipt
            );

            rec.printRecord();
            System.out.println("27269 - Q3 interactive session completed.");

        } catch (Exception e) {
            System.out.println("27269 - ERROR: " + e.getMessage());
        }

        sc.close();
    }
}
