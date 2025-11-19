package _27269.q3;

public class TaxDeclaration extends Employee {
    private String declarationMonth;
    private double totalIncome; // >=0

    public TaxDeclaration(int id, String createdDate, String updatedDate,
                          String authorityName, String region, String email,
                          String categoryName, double rate, String code,
                          String tin, String taxpayerName, String address,
                          String employerName, String employerTIN, String contact,
                          String employeeName, double salary, String employeeTIN,
                          String declarationMonth, double totalIncome)
            throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email,
              categoryName, rate, code, tin, taxpayerName, address,
              employerName, employerTIN, contact,
              employeeName, salary, employeeTIN);

        if (declarationMonth == null || declarationMonth.trim().isEmpty())
            throw new TaxDataException("declarationMonth required");
        if (totalIncome < 0) throw new TaxDataException("totalIncome must be >=0");

        this.declarationMonth = declarationMonth;
        this.totalIncome = totalIncome;
    }

    public String getDeclarationMonth() { return declarationMonth; }
    public double getTotalIncome() { return totalIncome; }
}
