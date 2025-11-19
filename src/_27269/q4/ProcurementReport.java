package _27269.q4;

public final class ProcurementReport extends Invoice {
    private String reportDate;
    private String summary;

    public ProcurementReport(int id, String createdDate, String updatedDate,
                             String orgName, String address, String contactEmail,
                             String deptName, String deptCode,
                             String supplierName, String supplierTIN, String contact,
                             String productName, double unitPrice, int quantity,
                             String poNumber, String orderDate, double totalAmount,
                             String deliveryDate, String deliveredBy,
                             String inspectorName, String status, String remarks,
                             String invoiceNo, double invoiceAmount,
                             String reportDate, String summary) {

        super(id, createdDate, updatedDate, orgName, address, contactEmail,
              deptName, deptCode, supplierName, supplierTIN, contact,
              productName, unitPrice, quantity, poNumber, orderDate, totalAmount,
              deliveryDate, deliveredBy, inspectorName, status, remarks,
              invoiceNo, invoiceAmount);

        if (reportDate == null || reportDate.trim().isEmpty())
            throw new IllegalArgumentException("reportDate required");

        this.reportDate = reportDate;
        this.summary = summary;
    }

    public double calculateTotal() {
        return getInvoiceAmount(); // required: sum of all invoice amounts — we use single invoice
    }

    public void printReport() {
        String p = "27269 - ";

        System.out.println(p + "----- PROCUREMENT REPORT -----");
        System.out.println(p + "Report Date: " + reportDate);
        System.out.println(p + "Organization: " + getOrgName());
        System.out.println(p + "Department: " + getDeptName() + " (" + getDeptCode() + ")");
        System.out.println(p + "Supplier: " + getSupplierName() + " (TIN: " + getSupplierTIN() + ")");
        System.out.println(p + "Product: " + getProductName());
        System.out.println(p + "Invoice Amount: " + getInvoiceAmount());
        System.out.println(p + "Total Calculated: " + calculateTotal());
        System.out.println(p + "Summary: " + summary);
        System.out.println(p + "------------------------------");
    }
}
