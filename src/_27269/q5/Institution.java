package _27269.q5;

public class Institution extends Entity {
    private String institutionName;
    private String code; // >=3 chars
    private String address;

    public Institution(int id, String createdDate, String updatedDate,
                       String institutionName, String code, String address) {
        super(id, createdDate, updatedDate);
        if (institutionName == null || institutionName.trim().isEmpty()) throw new IllegalArgumentException("institutionName required");
        if (code == null || code.trim().length() < 3) throw new IllegalArgumentException("code must be >= 3 chars");
        if (address == null || address.trim().isEmpty()) throw new IllegalArgumentException("address required");
        this.institutionName = institutionName;
        this.code = code;
        this.address = address;
    }

    public String getInstitutionName() { return institutionName; }
    public String getCode() { return code; }
    public String getAddress() { return address; }
}
