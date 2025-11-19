package _27269.q1;

public class Purchase extends StockItem {
    private String purchaseDate; // not null
    private int purchasedQuantity; // > 0
    private String purchaseSupplierName; // supplier name used for purchase

    public Purchase(int id, String createdDate, String updatedDate,
                    String warehouseName, String location, String contactNumber,
                    String categoryName, String categoryCode,
                    String supplierName, String supplierEmail, String supplierPhone,
                    String productName, double unitPrice, int stockLimit,
                    int quantityAvailable, int reorderLevel,
                    String purchaseDate, int purchasedQuantity, String purchaseSupplierName) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
              categoryName, categoryCode, supplierName, supplierEmail, supplierPhone,
              productName, unitPrice, stockLimit, quantityAvailable, reorderLevel);
        if (purchaseDate == null || purchaseDate.trim().isEmpty())
            throw new IllegalArgumentException("purchaseDate cannot be null/empty");
        if (purchasedQuantity <= 0) throw new IllegalArgumentException("purchasedQuantity must be > 0");
        if (purchaseSupplierName == null || purchaseSupplierName.trim().isEmpty())
            throw new IllegalArgumentException("purchaseSupplierName cannot be null/empty");
        this.purchaseDate = purchaseDate;
        this.purchasedQuantity = purchasedQuantity;
        this.purchaseSupplierName = purchaseSupplierName;
        // When a purchase is created, increase available quantity
        increaseQuantity(purchasedQuantity);
    }

    public String getPurchaseDate() { return purchaseDate; }
    public int getPurchasedQuantity() { return purchasedQuantity; }
    public String getPurchaseSupplierName() { return purchaseSupplierName; }
}
