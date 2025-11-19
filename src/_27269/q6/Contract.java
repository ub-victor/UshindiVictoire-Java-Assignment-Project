package _27269.q6;

public class Contract extends Employee {
    private String contractType;   // Fixed / Permanent
    private String startDate;
    private String endDate;

    public Contract(int id, String createdDate, String updatedDate,
                    String employeeName, String employeeTIN, String department,
                    String contractType, String startDate, String endDate)
            throws PayrollException {
        super(id, createdDate, updatedDate, employeeName, employeeTIN, department);

        if (!contractType.equalsIgnoreCase("Fixed")
                && !contractType.equalsIgnoreCase("Permanent"))
            throw new PayrollException("contractType must be Fixed or Permanent");

        if (startDate == null || startDate.trim().isEmpty())
            throw new PayrollException("startDate required");
        if (endDate == null || endDate.trim().isEmpty())
            throw new PayrollException("endDate required");

        this.contractType = contractType;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getContractType() { return contractType; }
    public String getStartDate() { return startDate; }
    public String getEndDate() { return endDate; }
}
