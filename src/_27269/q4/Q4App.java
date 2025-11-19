package _27269.q4;

import java.util.Scanner;

public class Q4App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("27269 - Welcome to Q4: Procurement System Interactive Runner");

            System.out.print("27269 - Enter ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("27269 - Created date: ");
            String created = sc.nextLine();

            System.out.print("27269 - Updated date: ");
            String updated = sc.nextLine();

            System.out.print("27269 - Organization name: ");
            String org = sc.nextLine();

            System.out.print("27269 - Address: ");
            String addr = sc.nextLine();

            System.out.print("27269 - Contact email: ");
            String email = sc.nextLine();

            System.out.print("27269 - Department name: ");
            String dname = sc.nextLine();

            System.out.print("27269 - Department code (>=3 alnum): ");
            String dcode = sc.nextLine();

            System.out.print("27269 - Supplier name: ");
            String sname = sc.nextLine();

            System.out.print("27269 - Supplier TIN (9 digits): ");
            String stin = sc.nextLine();

            System.out.print("27269 - Supplier contact (10 digits): ");
            String scontact = sc.nextLine();

            System.out.print("27269 - Product name: ");
            String pname = sc.nextLine();

            System.out.print("27269 - Unit price: ");
            double uprice = Double.parseDouble(sc.nextLine());

            System.out.print("27269 - Quantity: ");
            int qty = Integer.parseInt(sc.nextLine());

            System.out.print("27269 - PO number: ");
            String po = sc.nextLine();

            System.out.print("27269 - Order date: ");
            String orderDate = sc.nextLine();

            System.out.print("27269 - Total amount: ");
            double tamt = Double.parseDouble(sc.nextLine());

            System.out.print("27269 - Delivery date: ");
            String delDate = sc.nextLine();

            System.out.print("27269 - Delivered by: ");
            String delBy = sc.nextLine();

            System.out.print("27269 - Inspector name: ");
            String insp = sc.nextLine();

            System.out.print("27269 - Status (Passed/Failed): ");
            String status = sc.nextLine();

            System.out.print("27269 - Remarks: ");
            String remarks = sc.nextLine();

            System.out.print("27269 - Invoice number: ");
            String invNo = sc.nextLine();

            System.out.print("27269 - Invoice amount: ");
            double invAmt = Double.parseDouble(sc.nextLine());

            System.out.print("27269 - Report date: ");
            String rdate = sc.nextLine();

            System.out.print("27269 - Summary: ");
            String summary = sc.nextLine();

            ProcurementReport rep = new ProcurementReport(
                id,created,updated,
                org,addr,email,
                dname,dcode,
                sname,stin,scontact,
                pname,uprice,qty,
                po,orderDate,tamt,
                delDate,delBy,
                insp,status,remarks,
                invNo,invAmt,
                rdate,summary
            );

            rep.printReport();
            System.out.println("27269 - Q4 interactive session completed.");

        } catch (Exception e) {
            System.out.println("27269 - ERROR: " + e.getMessage());
        }

        sc.close();
    }
}
