package _27269.q4;

public class Organization extends Entity {
    private String orgName;
    private String address;
    private String contactEmail;

    public Organization(int id, String createdDate, String updatedDate,
                        String orgName, String address, String contactEmail) {
        super(id, createdDate, updatedDate);

        if (orgName == null || orgName.trim().isEmpty())
            throw new IllegalArgumentException("orgName required");
        if (address == null || address.trim().isEmpty())
            throw new IllegalArgumentException("address required");
        if (!isValidEmail(contactEmail))
            throw new IllegalArgumentException("Invalid email");

        this.orgName = orgName;
        this.address = address;
        this.contactEmail = contactEmail;
    }

    private boolean isValidEmail(String e) {
        return e != null && e.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
    }

    public String getOrgName() { return orgName; }
    public String getAddress() { return address; }
    public String getContactEmail() { return contactEmail; }
}
