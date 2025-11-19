package _27269.q1;

public class Warehouse extends Entity {
    private String warehouseName;
    private String location;
    private String contactNumber; // must be 10 digits

    public Warehouse(int id, String createdDate, String updatedDate,
                     String warehouseName, String location, String contactNumber) {
        super(id, createdDate, updatedDate);
        if (warehouseName == null || warehouseName.trim().isEmpty())
            throw new IllegalArgumentException("warehouseName cannot be empty");
        if (location == null || location.trim().isEmpty())
            throw new IllegalArgumentException("location cannot be empty");
        if (!isValidPhone(contactNumber))
            throw new IllegalArgumentException("contactNumber must be exactly 10 digits");
        this.warehouseName = warehouseName;
        this.location = location;
        this.contactNumber = contactNumber;
    }

    private boolean isValidPhone(String p) {
        if (p == null) return false;
        String digits = p.trim();
        return digits.matches("\\d{10}");
    }

    public String getWarehouseName() { return warehouseName; }
    public String getLocation() { return location; }
    public String getContactNumber() { return contactNumber; }
}
