package _27269.q6;

public class PayGrade extends Position {
    private String gradeName;      // e.g., A1, B2
    private double multiplier;     // > 0

    public PayGrade(int id, String createdDate, String updatedDate,
                    String employeeName, String employeeTIN, String department,
                    String contractType, String startDate, String endDate,
                    String positionName, double baseSalary,
                    String gradeName, double multiplier)
            throws PayrollException {
        super(id, createdDate, updatedDate, employeeName, employeeTIN, department,
                contractType, startDate, endDate, positionName, baseSalary);

        if (gradeName == null || gradeName.trim().isEmpty())
            throw new PayrollException("gradeName required");
        if (multiplier <= 0)
            throw new PayrollException("multiplier must be > 0");

        this.gradeName = gradeName;
        this.multiplier = multiplier;
    }

    public String getGradeName() { return gradeName; }
    public double getMultiplier() { return multiplier; }
}
