package _27269.q4;

public class Supplier extends Department {
    private String supplierName;
    private String supplierTIN;  // 9 digits
    private String contact;      // 10 digit phone

    public Supplier(int id, String createdDate, String updatedDate,
                    String orgName, String address, String contactEmail,
                    String deptName, String deptCode,
                    String supplierName, String supplierTIN, String contact) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode);

        if (supplierName == null || supplierName.trim().isEmpty())
            throw new IllegalArgumentException("supplierName required");
        if (!isValidTIN(supplierTIN))
            throw new IllegalArgumentException("supplierTIN must be 9 digits");
        if (!isValidPhone(contact))
            throw new IllegalArgumentException("contact must be 10 digits");

        this.supplierName = supplierName;
        this.supplierTIN = supplierTIN;
        this.contact = contact;
    }

    private boolean isValidTIN(String t) { return t != null && t.matches("\\d{9}"); }
    private boolean isValidPhone(String p) { return p != null && p.matches("\\d{10}"); }

    public String getSupplierName() { return supplierName; }
    public String getSupplierTIN() { return supplierTIN; }
    public String getContact() { return contact; }
}
