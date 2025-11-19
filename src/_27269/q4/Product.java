package _27269.q4;

public class Product extends Supplier {
    private String productName;
    private double unitPrice;   // > 0
    private int quantity;       // >= 0

    public Product(int id, String createdDate, String updatedDate,
                   String orgName, String address, String contactEmail,
                   String deptName, String deptCode,
                   String supplierName, String supplierTIN, String contact,
                   String productName, double unitPrice, int quantity) {

        super(id, createdDate, updatedDate, orgName, address, contactEmail,
              deptName, deptCode, supplierName, supplierTIN, contact);

        if (productName == null || productName.trim().isEmpty())
            throw new IllegalArgumentException("productName required");
        if (unitPrice <= 0) throw new IllegalArgumentException("unitPrice must be > 0");
        if (quantity < 0) throw new IllegalArgumentException("quantity >= 0");

        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getProductName() { return productName; }
    public double getUnitPrice() { return unitPrice; }
    public int getQuantity() { return quantity; }
}
