package _27269.q6;

public class Position extends Contract {
    private String positionName;
    private double baseSalary;  // > 0

    public Position(int id, String createdDate, String updatedDate,
                    String employeeName, String employeeTIN, String department,
                    String contractType, String startDate, String endDate,
                    String positionName, double baseSalary)
            throws PayrollException {
        super(id, createdDate, updatedDate, employeeName, employeeTIN, department,
                contractType, startDate, endDate);

        if (positionName == null || positionName.trim().isEmpty())
            throw new PayrollException("positionName required");
        if (baseSalary <= 0)
            throw new PayrollException("baseSalary must be > 0");

        this.positionName = positionName;
        this.baseSalary = baseSalary;
    }

    public String getPositionName() { return positionName; }
    public double getBaseSalary() { return baseSalary; }
}
