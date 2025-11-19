package _27269.q4;

public class Delivery extends PurchaseOrder {
    private String deliveryDate;
    private String deliveredBy;

    public Delivery(int id, String createdDate, String updatedDate,
                    String orgName, String address, String contactEmail,
                    String deptName, String deptCode,
                    String supplierName, String supplierTIN, String contact,
                    String productName, double unitPrice, int quantity,
                    String poNumber, String orderDate, double totalAmount,
                    String deliveryDate, String deliveredBy) {

        super(id, createdDate, updatedDate, orgName, address, contactEmail,
              deptName, deptCode, supplierName, supplierTIN, contact,
              productName, unitPrice, quantity, poNumber, orderDate, totalAmount);

        if (deliveryDate == null || deliveryDate.trim().isEmpty())
            throw new IllegalArgumentException("deliveryDate required");

        if (deliveredBy == null || deliveredBy.trim().isEmpty())
            throw new IllegalArgumentException("deliveredBy required");

        this.deliveryDate = deliveryDate;
        this.deliveredBy = deliveredBy;
    }

    public String getDeliveryDate() { return deliveryDate; }
    public String getDeliveredBy() { return deliveredBy; }
}
