package _27269.q1;

public class Category extends Warehouse {
    private String categoryName;
    private String categoryCode; // alphanumeric; >=3 chars

    public Category(int id, String createdDate, String updatedDate,
                    String warehouseName, String location, String contactNumber,
                    String categoryName, String categoryCode) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber);
        if (categoryName == null || categoryName.trim().isEmpty())
            throw new IllegalArgumentException("categoryName cannot be empty");
        if (categoryCode == null || categoryCode.trim().length() < 3 || !categoryCode.matches("[A-Za-z0-9]+"))
            throw new IllegalArgumentException("categoryCode must be alphanumeric and at least 3 chars");
        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() { return categoryName; }
    public String getCategoryCode() { return categoryCode; }
}
