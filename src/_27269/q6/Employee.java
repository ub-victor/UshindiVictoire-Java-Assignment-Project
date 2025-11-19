package _27269.q6;

public class Employee extends Entity {
    private String employeeName;
    private String employeeTIN;   // 9 digits
    private String department;

    public Employee(int id, String createdDate, String updatedDate,
                    String employeeName, String employeeTIN, String department)
            throws PayrollException {
        super(id, createdDate, updatedDate);

        if (employeeName == null || employeeName.trim().isEmpty())
            throw new PayrollException("employeeName required");
        if (!isValidTIN(employeeTIN))
            throw new PayrollException("employeeTIN must be 9 digits");
        if (department == null || department.trim().isEmpty())
            throw new PayrollException("department required");

        this.employeeName = employeeName;
        this.employeeTIN = employeeTIN;
        this.department = department;
    }

    private boolean isValidTIN(String tin) {
        return tin != null && tin.matches("\\d{9}");
    }

    public String getEmployeeName() { return employeeName; }
    public String getEmployeeTIN() { return employeeTIN; }
    public String getDepartment() { return department; }
}
