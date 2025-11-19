package _27269.q1;

public class StockItem extends Product {
    private int quantityAvailable; // >=0
    private int reorderLevel; // >=0

    public StockItem(int id, String createdDate, String updatedDate,
                     String warehouseName, String location, String contactNumber,
                     String categoryName, String categoryCode,
                     String supplierName, String supplierEmail, String supplierPhone,
                     String productName, double unitPrice, int stockLimit,
                     int quantityAvailable, int reorderLevel) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
              categoryName, categoryCode, supplierName, supplierEmail, supplierPhone,
              productName, unitPrice, stockLimit);
        if (quantityAvailable < 0) throw new IllegalArgumentException("quantityAvailable must be >= 0");
        if (reorderLevel < 0) throw new IllegalArgumentException("reorderLevel must be >= 0");
        this.quantityAvailable = quantityAvailable;
        this.reorderLevel = reorderLevel;
    }

    public int getQuantityAvailable() { return quantityAvailable; }
    public int getReorderLevel() { return reorderLevel; }

    public void increaseQuantity(int qty) {
        if (qty <= 0) throw new IllegalArgumentException("qty must be > 0");
        this.quantityAvailable += qty;
    }

    public void decreaseQuantity(int qty) {
        if (qty <= 0) throw new IllegalArgumentException("qty must be > 0");
        if (qty > quantityAvailable) throw new IllegalArgumentException("Not enough stock");
        this.quantityAvailable -= qty;
    }
}
