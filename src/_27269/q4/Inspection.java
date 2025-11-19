package _27269.q4;

public class Inspection extends Delivery {
    private String inspectorName;
    private String status; // Passed/Failed
    private String remarks;

    public Inspection(int id, String createdDate, String updatedDate,
                      String orgName, String address, String contactEmail,
                      String deptName, String deptCode,
                      String supplierName, String supplierTIN, String contact,
                      String productName, double unitPrice, int quantity,
                      String poNumber, String orderDate, double totalAmount,
                      String deliveryDate, String deliveredBy,
                      String inspectorName, String status, String remarks) {

        super(id, createdDate, updatedDate, orgName, address, contactEmail,
              deptName, deptCode, supplierName, supplierTIN, contact,
              productName, unitPrice, quantity, poNumber, orderDate, totalAmount,
              deliveryDate, deliveredBy);

        if (inspectorName == null || inspectorName.trim().isEmpty())
            throw new IllegalArgumentException("inspectorName required");

        if (!status.equalsIgnoreCase("Passed") &&
            !status.equalsIgnoreCase("Failed"))
            throw new IllegalArgumentException("status must be Passed or Failed");

        this.inspectorName = inspectorName;
        this.status = status;
        this.remarks = remarks;
    }

    public String getInspectorName() { return inspectorName; }
    public String getStatus() { return status; }
    public String getRemarks() { return remarks; }
}
