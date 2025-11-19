package _27269.q4;

public class Invoice extends Inspection {
    private String invoiceNo;
    private double invoiceAmount; // > 0

    public Invoice(int id, String createdDate, String updatedDate,
                   String orgName, String address, String contactEmail,
                   String deptName, String deptCode,
                   String supplierName, String supplierTIN, String contact,
                   String productName, double unitPrice, int quantity,
                   String poNumber, String orderDate, double totalAmount,
                   String deliveryDate, String deliveredBy,
                   String inspectorName, String status, String remarks,
                   String invoiceNo, double invoiceAmount) {

        super(id, createdDate, updatedDate, orgName, address, contactEmail,
              deptName, deptCode, supplierName, supplierTIN, contact,
              productName, unitPrice, quantity, poNumber, orderDate, totalAmount,
              deliveryDate, deliveredBy, inspectorName, status, remarks);

        if (invoiceNo == null || invoiceNo.trim().isEmpty())
            throw new IllegalArgumentException("invoiceNo required");
        if (invoiceAmount <= 0)
            throw new IllegalArgumentException("invoiceAmount must be > 0");

        this.invoiceNo = invoiceNo;
        this.invoiceAmount = invoiceAmount;
    }

    public String getInvoiceNo() { return invoiceNo; }
    public double getInvoiceAmount() { return invoiceAmount; }
}
