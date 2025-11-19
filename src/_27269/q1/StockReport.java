package _27269.q1;

/**
 * Final class. Implements generateReport() to summarize total stock and sales.
 * All printed output lines are prefixed with student ID "27269 - " to follow output rule.
 */
public final class StockReport extends Inventory {
    private String reportDate;
    private String remarks;

    public StockReport(int id, String createdDate, String updatedDate,
                       String warehouseName, String location, String contactNumber,
                       String categoryName, String categoryCode,
                       String supplierName, String supplierEmail, String supplierPhone,
                       String productName, double unitPrice, int stockLimit,
                       int quantityAvailable, int reorderLevel,
                       String purchaseDate, int purchasedQuantity, String purchaseSupplierName,
                       String saleDate, int soldQuantity, String customerName,
                       int totalItems, double stockValue,
                       String reportDate, String remarks) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
              categoryName, categoryCode, supplierName, supplierEmail, supplierPhone,
              productName, unitPrice, stockLimit, quantityAvailable, reorderLevel,
              purchaseDate, purchasedQuantity, purchaseSupplierName,
              saleDate, soldQuantity, customerName, totalItems, stockValue);
        if (reportDate == null || reportDate.trim().isEmpty())
            throw new IllegalArgumentException("reportDate cannot be null/empty");
        if (remarks == null) remarks = "";
        this.reportDate = reportDate;
        this.remarks = remarks;
    }

    public void generateReport() {
        String prefix = "27269 - ";
        System.out.println(prefix + "STOCK REPORT");
        System.out.println(prefix + "Report Date: " + reportDate);
        System.out.println(prefix + "Warehouse: " + getWarehouseName() + " (Location: " + getLocation() + ")");
        System.out.println(prefix + "Category: " + getCategoryName() + " [" + getCategoryCode() + "]");
        System.out.println(prefix + "Supplier: " + getSupplierName() + " (Email: " + getSupplierEmail() + ")");
        System.out.println(prefix + "Product: " + getProductName());
        System.out.println(prefix + "Unit Price: " + getUnitPrice());
        System.out.println(prefix + "Current Quantity Available: " + getQuantityAvailable());
        System.out.println(prefix + "Reorder Level: " + getReorderLevel());
        System.out.println(prefix + "Total Items (inventory total): " + getTotalItems());
        System.out.printf(prefix + "Total Stock Value: %.2f%n", getStockValue());
        System.out.println(prefix + "Remarks: " + remarks);
        // Summary line required by assignment: summarize total stock and sales
        System.out.println(prefix + "Summary: Total Items = " + getTotalItems() + ", Current Stock = " + getQuantityAvailable());
    }

    public String getReportDate() { return reportDate; }
    public String getRemarks() { return remarks; }
}
