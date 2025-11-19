package _27269.q6;

public class Payroll extends Deduction {
    private String month;
    private int workingDays;

    public Payroll(int id, String createdDate, String updatedDate,
                   String employeeName, String employeeTIN, String department,
                   String contractType, String startDate, String endDate,
                   String positionName, double baseSalary,
                   String gradeName, double multiplier,
                   double housingAllowance, double transportAllowance, double otherAllowance,
                   double rssb, double rra, double otherDeductions,
                   String month, int workingDays)
            throws PayrollException {
        super(id, createdDate, updatedDate, employeeName, employeeTIN, department,
                contractType, startDate, endDate, positionName, baseSalary,
                gradeName, multiplier,
                housingAllowance, transportAllowance, otherAllowance,
                rssb, rra, otherDeductions);

        if (month == null || month.trim().isEmpty())
            throw new PayrollException("month required");
        if (workingDays <= 0)
            throw new PayrollException("workingDays must be > 0");

        this.month = month;
        this.workingDays = workingDays;
    }

    public String getMonth() { return month; }
    public int getWorkingDays() { return workingDays; }
}
