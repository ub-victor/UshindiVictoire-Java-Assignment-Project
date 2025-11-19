package _27269.q3;

public class TaxAuthority extends Entity {
    private String authorityName;
    private String region;
    private String email;

    public TaxAuthority(int id, String createdDate, String updatedDate,
                        String authorityName, String region, String email)
            throws TaxDataException {
        super(id, createdDate, updatedDate);
        if (authorityName == null || authorityName.trim().isEmpty())
            throw new TaxDataException("Authority name required");
        if (region == null || region.trim().isEmpty())
            throw new TaxDataException("Region required");
        if (!isValidEmail(email))
            throw new TaxDataException("Invalid email");
        this.authorityName = authorityName;
        this.region = region;
        this.email = email;
    }

    private boolean isValidEmail(String e) {
        return e != null && e.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
    }

    public String getAuthorityName() { return authorityName; }
    public String getRegion() { return region; }
    public String getEmail() { return email; }
}
