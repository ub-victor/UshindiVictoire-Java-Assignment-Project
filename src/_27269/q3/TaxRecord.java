package _27269.q3;

public final class TaxRecord extends Payment {
    private String receiptNo;
    private double totalTax;

    public TaxRecord(int id, String createdDate, String updatedDate,
                     String authorityName, String region, String email,
                     String categoryName, double rate, String code,
                     String tin, String taxpayerName, String address,
                     String employerName, String employerTIN, String contact,
                     String employeeName, double salary, String employeeTIN,
                     String declarationMonth, double totalIncome,
                     String assessmentDate, double assessedTax,
                     String paymentDate, double paymentAmount,
                     String receiptNo)
            throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email,
              categoryName, rate, code, tin, taxpayerName, address,
              employerName, employerTIN, contact,
              employeeName, salary, employeeTIN,
              declarationMonth, totalIncome,
              assessmentDate, assessedTax,
              paymentDate, paymentAmount);

        if (receiptNo == null || receiptNo.trim().isEmpty())
            throw new TaxDataException("receiptNo required");

        this.receiptNo = receiptNo;
        this.totalTax = computeTax();
    }

    /** computeTax = (salary × rate) – credits  (credits = 2% of salary) */
    public double computeTax() {
        double salary = getSalary();
        double rate = getRate();
        double credits = salary * 0.02; // simple credits rule
        return (salary * rate) - credits;
    }

    public void printRecord() {
        String p = "27269 - ";
        System.out.println(p + "----- TAX RECORD -----");
        System.out.println(p + "Receipt #: " + receiptNo);
        System.out.println(p + "Taxpayer: " + getTaxpayerName() + " (TIN: " + getTin() + ")");
        System.out.println(p + "Employee: " + getEmployeeName() + " | Salary: " + getSalary());
        System.out.println(p + "Category: " + getCategoryName() + " (Rate: " + getRate() + ")");
        System.out.println(p + "Assessed Tax: " + getAssessedTax());
        System.out.println(p + "Total Tax (computed): " + totalTax);
        System.out.println(p + "Payment Date: " + getPaymentDate());
        System.out.println(p + "Amount Paid: " + getPaymentAmount());
        System.out.println(p + "----------------------");
    }
}
