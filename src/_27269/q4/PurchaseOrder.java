package _27269.q4;

public class PurchaseOrder extends Product {
    private String poNumber;
    private String orderDate;
    private double totalAmount; // > 0

    public PurchaseOrder(int id, String createdDate, String updatedDate,
                         String orgName, String address, String contactEmail,
                         String deptName, String deptCode,
                         String supplierName, String supplierTIN, String contact,
                         String productName, double unitPrice, int quantity,
                         String poNumber, String orderDate, double totalAmount) {

        super(id, createdDate, updatedDate, orgName, address, contactEmail,
              deptName, deptCode, supplierName, supplierTIN, contact,
              productName, unitPrice, quantity);

        if (poNumber == null || poNumber.trim().isEmpty())
            throw new IllegalArgumentException("poNumber required");
        if (orderDate == null || orderDate.trim().isEmpty())
            throw new IllegalArgumentException("orderDate required");
        if (totalAmount <= 0)
            throw new IllegalArgumentException("totalAmount must be > 0");

        this.poNumber = poNumber;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }

    public String getPoNumber() { return poNumber; }
    public String getOrderDate() { return orderDate; }
    public double getTotalAmount() { return totalAmount; }
}

