package _27269.q3;

public class Employee extends Employer {
    private String employeeName;
    private double salary; // >0
    private String employeeTIN; // 9 digits

    public Employee(int id, String createdDate, String updatedDate,
                    String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address,
                    String employerName, String employerTIN, String contact,
                    String employeeName, double salary, String employeeTIN)
            throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email,
              categoryName, rate, code, tin, taxpayerName, address,
              employerName, employerTIN, contact);

        if (employeeName == null || employeeName.trim().isEmpty())
            throw new TaxDataException("employeeName required");
        if (salary <= 0) throw new TaxDataException("salary must be >0");
        if (!isValidTIN(employeeTIN))
            throw new TaxDataException("Employee TIN must be 9 digits");

        this.employeeName = employeeName;
        this.salary = salary;
        this.employeeTIN = employeeTIN;
    }

    private boolean isValidTIN(String t) {
        return t != null && t.matches("\\d{9}");
    }

    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }
    public String getEmployeeTIN() { return employeeTIN; }
}
