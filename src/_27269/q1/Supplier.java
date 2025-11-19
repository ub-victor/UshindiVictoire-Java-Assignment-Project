package _27269.q1;

public class Supplier extends Category {
    private String supplierName;
    private String supplierEmail;
    private String supplierPhone; // 10-digit

    public Supplier(int id, String createdDate, String updatedDate,
                    String warehouseName, String location, String contactNumber,
                    String categoryName, String categoryCode,
                    String supplierName, String supplierEmail, String supplierPhone) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber, categoryName, categoryCode);
        if (supplierName == null || supplierName.trim().isEmpty())
            throw new IllegalArgumentException("supplierName cannot be empty");
        if (!isValidEmail(supplierEmail))
            throw new IllegalArgumentException("supplierEmail invalid");
        if (!isValidPhone(supplierPhone))
            throw new IllegalArgumentException("supplierPhone must be exactly 10 digits");
        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        this.supplierPhone = supplierPhone;
    }

    private boolean isValidEmail(String e) {
        if (e == null) return false;
        // simple email validation
        return e.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
    }

    private boolean isValidPhone(String p) {
        if (p == null) return false;
        return p.matches("\\d{10}");
    }

    public String getSupplierName() { return supplierName; }
    public String getSupplierEmail() { return supplierEmail; }
    public String getSupplierPhone() { return supplierPhone; }
}
