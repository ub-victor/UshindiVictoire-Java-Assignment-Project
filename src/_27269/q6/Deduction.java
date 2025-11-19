package _27269.q6;

public class Deduction extends Allowance {
    private double rssb;    // >0
    private double rra;     // >0
    private double otherDeductions; // >= 0

    public Deduction(int id, String createdDate, String updatedDate,
                     String employeeName, String employeeTIN, String department,
                     String contractType, String startDate, String endDate,
                     String positionName, double baseSalary,
                     String gradeName, double multiplier,
                     double housingAllowance, double transportAllowance, double otherAllowance,
                     double rssb, double rra, double otherDeductions)
            throws PayrollException {
        super(id, createdDate, updatedDate, employeeName, employeeTIN, department,
                contractType, startDate, endDate, positionName, baseSalary,
                gradeName, multiplier,
                housingAllowance, transportAllowance, otherAllowance);

        if (rssb < 0) throw new PayrollException("rssb must be >= 0");
        if (rra < 0) throw new PayrollException("rra must be >= 0");
        if (otherDeductions < 0) throw new PayrollException("otherDeductions >= 0");

        this.rssb = rssb;
        this.rra = rra;
        this.otherDeductions = otherDeductions;
    }

    public double getRssb() { return rssb; }
    public double getRra() { return rra; }
    public double getOtherDeductions() { return otherDeductions; }
}
