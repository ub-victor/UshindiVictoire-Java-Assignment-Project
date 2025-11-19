package _27269.q3;

public class Taxpayer extends TaxCategory {
    private String tin; // 9 digits
    private String taxpayerName;
    private String address;

    public Taxpayer(int id, String createdDate, String updatedDate,
                    String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address)
            throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email,
              categoryName, rate, code);
        if (!isValidTIN(tin)) throw new TaxDataException("TIN must be 9 digits");
        if (taxpayerName == null || taxpayerName.trim().isEmpty())
            throw new TaxDataException("taxpayerName required");
        if (address == null || address.trim().isEmpty())
            throw new TaxDataException("address required");
        this.tin = tin;
        this.taxpayerName = taxpayerName;
        this.address = address;
    }

    private boolean isValidTIN(String t) {
        return t != null && t.matches("\\d{9}");
    }

    public String getTin() { return tin; }
    public String getTaxpayerName() { return taxpayerName; }
    public String getAddress() { return address; }
}
