package _27269.q4;

public class Department extends Organization {
    private String deptName;
    private String deptCode; // alphanumeric >= 3

    public Department(int id, String createdDate, String updatedDate,
                      String orgName, String address, String contactEmail,
                      String deptName, String deptCode) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail);

        if (deptName == null || deptName.trim().isEmpty())
            throw new IllegalArgumentException("deptName required");
        if (deptCode == null || deptCode.trim().length() < 3 || !deptCode.matches("[A-Za-z0-9]+"))
            throw new IllegalArgumentException("deptCode must be alphanumeric >=3");

        this.deptName = deptName;
        this.deptCode = deptCode;
    }

    public String getDeptName() { return deptName; }
    public String getDeptCode() { return deptCode; }
}
