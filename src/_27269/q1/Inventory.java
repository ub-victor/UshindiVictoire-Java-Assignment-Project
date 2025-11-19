package _27269.q1;

public class Inventory extends Sale {
    private int totalItems; // totals >= 0
    private double stockValue; // totals >= 0

    public Inventory(int id, String createdDate, String updatedDate,
                     String warehouseName, String location, String contactNumber,
                     String categoryName, String categoryCode,
                     String supplierName, String supplierEmail, String supplierPhone,
                     String productName, double unitPrice, int stockLimit,
                     int quantityAvailable, int reorderLevel,
                     String purchaseDate, int purchasedQuantity, String purchaseSupplierName,
                     String saleDate, int soldQuantity, String customerName,
                     int totalItems, double stockValue) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
              categoryName, categoryCode, supplierName, supplierEmail, supplierPhone,
              productName, unitPrice, stockLimit, quantityAvailable, reorderLevel,
              purchaseDate, purchasedQuantity, purchaseSupplierName,
              saleDate, soldQuantity, customerName);
        if (totalItems < 0) throw new IllegalArgumentException("totalItems must be >= 0");
        if (stockValue < 0) throw new IllegalArgumentException("stockValue must be >= 0");
        this.totalItems = totalItems;
        this.stockValue = stockValue;
    }

    public int getTotalItems() { return totalItems; }
    public double getStockValue() { return stockValue; }

    public void setTotalItems(int totalItems) {
        if (totalItems < 0) throw new IllegalArgumentException("totalItems must be >= 0");
        this.totalItems = totalItems;
    }

    public void setStockValue(double stockValue) {
        if (stockValue < 0) throw new IllegalArgumentException("stockValue must be >= 0");
        this.stockValue = stockValue;
    }
}
