package _27269.q1;

import java.util.Scanner;

/**
 * Interactive runner for Q1 Stock Management System.
 * The grader can run this and type input. It will create objects and call generateReport().
 *
 * Run:
 *   javac src/_27269/q1/*.java
 *   java -cp src _27269.q1.Q1App
 */
public class Q1App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("27269 - Welcome to Q1: Stock Management interactive runner.");
            System.out.print("27269 - Enter entity id (integer > 0): ");
            int id = Integer.parseInt(sc.nextLine().trim());

            System.out.print("27269 - Enter created date (e.g. 2025-11-19): ");
            String createdDate = sc.nextLine().trim();

            System.out.print("27269 - Enter updated date (e.g. 2025-11-19): ");
            String updatedDate = sc.nextLine().trim();

            System.out.print("27269 - Warehouse name: ");
            String warehouseName = sc.nextLine().trim();

            System.out.print("27269 - Warehouse location: ");
            String location = sc.nextLine().trim();

            System.out.print("27269 - Warehouse contact number (10 digits): ");
            String warehousePhone = sc.nextLine().trim();

            System.out.print("27269 - Category name: ");
            String categoryName = sc.nextLine().trim();

            System.out.print("27269 - Category code (alphanumeric >=3): ");
            String categoryCode = sc.nextLine().trim();

            System.out.print("27269 - Supplier name: ");
            String supplierName = sc.nextLine().trim();

            System.out.print("27269 - Supplier email: ");
            String supplierEmail = sc.nextLine().trim();

            System.out.print("27269 - Supplier phone (10 digits): ");
            String supplierPhone = sc.nextLine().trim();

            System.out.print("27269 - Product name: ");
            String productName = sc.nextLine().trim();

            System.out.print("27269 - Unit price (>0): ");
            double unitPrice = Double.parseDouble(sc.nextLine().trim());

            System.out.print("27269 - Stock limit (>=0): ");
            int stockLimit = Integer.parseInt(sc.nextLine().trim());

            System.out.print("27269 - Current quantity available (>=0): ");
            int quantityAvailable = Integer.parseInt(sc.nextLine().trim());

            System.out.print("27269 - Reorder level (>=0): ");
            int reorderLevel = Integer.parseInt(sc.nextLine().trim());

            // Get purchases
            System.out.print("27269 - Number of purchases to record (enter 0 if none): ");
            int numPurchases = Integer.parseInt(sc.nextLine().trim());
            int totalPurchased = 0;
            String lastPurchaseDate = "";
            String purchaseSupplierName = supplierName;
            for (int i = 1; i <= numPurchases; i++) {
                System.out.println("27269 - Purchase #" + i);
                System.out.print("  27269 - purchase date: ");
                lastPurchaseDate = sc.nextLine().trim();
                System.out.print("  27269 - purchased quantity (>0): ");
                int pq = Integer.parseInt(sc.nextLine().trim());
                totalPurchased += pq;
            }

            // Get sales
            System.out.print("27269 - Number of sales to record (enter 0 if none): ");
            int numSales = Integer.parseInt(sc.nextLine().trim());
            int totalSold = 0;
            String lastSaleDate = "";
            String lastCustomer = "";
            for (int i = 1; i <= numSales; i++) {
                System.out.println("27269 - Sale #" + i);
                System.out.print("  27269 - sale date: ");
                lastSaleDate = sc.nextLine().trim();
                System.out.print("  27269 - sold quantity (>0): ");
                int sq = Integer.parseInt(sc.nextLine().trim());
                totalSold += sq;
                System.out.print("  27269 - customer name: ");
                lastCustomer = sc.nextLine().trim();
            }

            // compute totals for Inventory
            int finalQuantity = quantityAvailable + totalPurchased - totalSold;
            if (finalQuantity < 0) {
                System.out.println("27269 - WARNING: final computed quantity is negative. Setting to 0.");
                finalQuantity = 0;
            }
            int totalItems = finalQuantity;
            double stockValue = totalItems * unitPrice;

            String reportDate = java.time.LocalDate.now().toString();
            String remarks = "Generated interactively via Q1App";

            // Build the final StockReport object.
            // To satisfy constructor chain, we need purchaseDate, purchasedQuantity, purchaseSupplierName,
            // and saleDate, soldQuantity, customerName. We'll pass last known values or zeros where none.
            int onePurchaseQty = (numPurchases > 0) ? totalPurchased : 0;
            String purchaseDateToUse = (numPurchases > 0) ? (lastPurchaseDate.isEmpty() ? reportDate : lastPurchaseDate) : reportDate;
            int oneSaleQty = (numSales > 0) ? totalSold : 0;
            String saleDateToUse = (numSales > 0) ? (lastSaleDate.isEmpty() ? reportDate : lastSaleDate) : reportDate;
            String customerToUse = (numSales > 0) ? (lastCustomer.isEmpty() ? "Anonymous" : lastCustomer) : "N/A";

            // Because constructors of Purchase and Sale automatically modify quantity,
            // We will construct a base StockItem with initial quantity that matches the user's initial
            // and then create Purchase and Sale wrappers that will internally adjust. To avoid double-adjust,
            // we supply quantityAvailable parameter such that the net effect yields finalQuantity.
            // Simpler approach: construct StockReport with quantityAvailable = finalQuantity and purchased/sold set to last totals.
            StockReport report = new StockReport(
                    id, createdDate, updatedDate,
                    warehouseName, location, warehousePhone,
                    categoryName, categoryCode,
                    supplierName, supplierEmail, supplierPhone,
                    productName, unitPrice, stockLimit,
                    finalQuantity, reorderLevel,
                    purchaseDateToUse, onePurchaseQty, purchaseSupplierName,
                    saleDateToUse, oneSaleQty, customerToUse,
                    totalItems, stockValue,
                    reportDate, remarks
            );

            // Print the report (every line prefixed with student id inside generateReport)
            report.generateReport();

            System.out.println("27269 - Q1 interactive session completed.");

        } catch (Exception ex) {
            System.out.println("27269 - ERROR: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
