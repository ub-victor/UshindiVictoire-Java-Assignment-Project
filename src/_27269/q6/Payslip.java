package _27269.q6;

public final class Payslip extends Payroll {
    private String payslipNumber;

    public Payslip(int id, String createdDate, String updatedDate,
                   String employeeName, String employeeTIN, String department,
                   String contractType, String startDate, String endDate,
                   String positionName, double baseSalary,
                   String gradeName, double multiplier,
                   double housingAllowance, double transportAllowance, double otherAllowance,
                   double rssb, double rra, double otherDeductions,
                   String month, int workingDays,
                   String payslipNumber)
            throws PayrollException {
        super(id, createdDate, updatedDate, employeeName, employeeTIN, department,
                contractType, startDate, endDate, positionName, baseSalary,
                gradeName, multiplier,
                housingAllowance, transportAllowance, otherAllowance,
                rssb, rra, otherDeductions,
                month, workingDays);

        if (payslipNumber == null || payslipNumber.trim().isEmpty())
            throw new PayrollException("payslipNumber required");

        this.payslipNumber = payslipNumber;
    }

    public double calculateNetSalary() {
        double gross = (getBaseSalary() * getMultiplier())
                + getHousingAllowance()
                + getTransportAllowance()
                + getOtherAllowance();

        double deductions = getRssb() + getRra() + getOtherDeductions();

        return gross - deductions;
    }

    public void printPayslip() {
        String p = "27269 - ";
        System.out.println(p + "********** PAYSLIP **********");
        System.out.println(p + "Payslip Number: " + payslipNumber);
        System.out.println(p + "Employee: " + getEmployeeName());
        System.out.println(p + "TIN: " + getEmployeeTIN());
        System.out.println(p + "Department: " + getDepartment());
        System.out.println(p + "Position: " + getPositionName());
        System.out.println(p + "Month: " + getMonth());
        System.out.println(p + "Working Days: " + getWorkingDays());
        System.out.println(p + "Base Salary: " + getBaseSalary());
        System.out.println(p + "Grade: " + getGradeName() + " (×" + getMultiplier() + ")");
        System.out.println(p + "Allowances: H=" + getHousingAllowance()
                + ", T=" + getTransportAllowance()
                + ", O=" + getOtherAllowance());
        System.out.println(p + "Deductions: RSSB=" + getRssb()
                + ", RRA=" + getRra()
                + ", Other=" + getOtherDeductions());
        System.out.println(p + "NET SALARY: " + calculateNetSalary());
        System.out.println(p + "******************************");
    }
}
