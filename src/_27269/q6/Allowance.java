package _27269.q6;

public class Allowance extends PayGrade {
    private double housingAllowance;
    private double transportAllowance;
    private double otherAllowance;

    public Allowance(int id, String createdDate, String updatedDate,
                     String employeeName, String employeeTIN, String department,
                     String contractType, String startDate, String endDate,
                     String positionName, double baseSalary,
                     String gradeName, double multiplier,
                     double housingAllowance, double transportAllowance, double otherAllowance)
            throws PayrollException {
        super(id, createdDate, updatedDate, employeeName, employeeTIN, department,
                contractType, startDate, endDate, positionName, baseSalary,
                gradeName, multiplier);

        if (housingAllowance < 0 || transportAllowance < 0 || otherAllowance < 0)
            throw new PayrollException("allowances must be >= 0");

        this.housingAllowance = housingAllowance;
        this.transportAllowance = transportAllowance;
        this.otherAllowance = otherAllowance;
    }

    public double getHousingAllowance() { return housingAllowance; }
    public double getTransportAllowance() { return transportAllowance; }
    public double getOtherAllowance() { return otherAllowance; }
}
