package _27269.q5;

public class Department extends Institution {
    private String departmentName;
    private String departmentHead;

    public Department(int id, String createdDate, String updatedDate,
                      String institutionName, String code, String address,
                      String departmentName, String departmentHead) {
        super(id, createdDate, updatedDate, institutionName, code, address);
        if (departmentName == null || departmentName.trim().isEmpty()) throw new IllegalArgumentException("departmentName required");
        if (departmentHead == null || departmentHead.trim().isEmpty()) throw new IllegalArgumentException("departmentHead required");
        this.departmentName = departmentName;
        this.departmentHead = departmentHead;
    }

    public String getDepartmentName() { return departmentName; }
    public String getDepartmentHead() { return departmentHead; }
}
