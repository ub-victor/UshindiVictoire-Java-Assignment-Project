package _27269.q3;

public class Payment extends TaxAssessment {
    private String paymentDate;
    private double paymentAmount; // >0

    public Payment(int id, String createdDate, String updatedDate,
                   String authorityName, String region, String email,
                   String categoryName, double rate, String code,
                   String tin, String taxpayerName, String address,
                   String employerName, String employerTIN, String contact,
                   String employeeName, double salary, String employeeTIN,
                   String declarationMonth, double totalIncome,
                   String assessmentDate, double assessedTax,
                   String paymentDate, double paymentAmount)
            throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email,
              categoryName, rate, code, tin, taxpayerName, address,
              employerName, employerTIN, contact,
              employeeName, salary, employeeTIN,
              declarationMonth, totalIncome,
              assessmentDate, assessedTax);

        if (paymentDate == null || paymentDate.trim().isEmpty())
            throw new TaxDataException("paymentDate required");
        if (paymentAmount <= 0) throw new TaxDataException("paymentAmount must be >0");

        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentDate() { return paymentDate; }
    public double getPaymentAmount() { return paymentAmount; }
}
