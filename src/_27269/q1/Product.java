package _27269.q1;

public class Product extends Supplier {
    private String productName;
    private double unitPrice; // > 0
    private int stockLimit; // >= 0

    public Product(int id, String createdDate, String updatedDate,
                   String warehouseName, String location, String contactNumber,
                   String categoryName, String categoryCode,
                   String supplierName, String supplierEmail, String supplierPhone,
                   String productName, double unitPrice, int stockLimit) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
              categoryName, categoryCode, supplierName, supplierEmail, supplierPhone);
        if (productName == null || productName.trim().isEmpty())
            throw new IllegalArgumentException("productName cannot be empty");
        if (unitPrice <= 0) throw new IllegalArgumentException("unitPrice must be > 0");
        if (stockLimit < 0) throw new IllegalArgumentException("stockLimit must be >= 0");
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.stockLimit = stockLimit;
    }

    public String getProductName() { return productName; }
    public double getUnitPrice() { return unitPrice; }
    public int getStockLimit() { return stockLimit; }
}
