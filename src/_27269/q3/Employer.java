package _27269.q3;

public class Employer extends Taxpayer {
    private String employerName;
    private String employerTIN; // 9 digits
    private String contact; // 10 digit phone

    public Employer(int id, String createdDate, String updatedDate,
                    String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address,
                    String employerName, String employerTIN, String contact)
            throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email,
              categoryName, rate, code, tin, taxpayerName, address);

        if (employerName == null || employerName.trim().isEmpty())
            throw new TaxDataException("employerName required");
        if (!isValidTIN(employerTIN))
            throw new TaxDataException("employerTIN must be 9 digits");
        if (!isValidPhone(contact))
            throw new TaxDataException("contact must be 10 digits");

        this.employerName = employerName;
        this.employerTIN = employerTIN;
        this.contact = contact;
    }

    private boolean isValidTIN(String t) {
        return t != null && t.matches("\\d{9}");
    }

    private boolean isValidPhone(String p) {
        return p != null && p.matches("\\d{10}");
    }

    public String getEmployerName() { return employerName; }
    public String getEmployerTIN() { return employerTIN; }
    public String getContact() { return contact; }
}
