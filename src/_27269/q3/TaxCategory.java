package _27269.q3;

public class TaxCategory extends TaxAuthority {
    private String categoryName;
    private double rate; // > 0
    private String code; // >=3 chars

    public TaxCategory(int id, String createdDate, String updatedDate,
                       String authorityName, String region, String email,
                       String categoryName, double rate, String code)
            throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email);
        if (categoryName == null || categoryName.trim().isEmpty())
            throw new TaxDataException("categoryName required");
        if (rate <= 0) throw new TaxDataException("rate must be > 0");
        if (code == null || code.trim().length() < 3)
            throw new TaxDataException("code must be >= 3 chars");
        this.categoryName = categoryName;
        this.rate = rate;
        this.code = code;
    }

    public String getCategoryName() { return categoryName; }
    public double getRate() { return rate; }
    public String getCode() { return code; }
}
