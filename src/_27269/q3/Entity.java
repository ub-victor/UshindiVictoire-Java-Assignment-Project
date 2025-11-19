package _27269.q3;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws TaxDataException {
        if (id <= 0) throw new TaxDataException("ID must be > 0");
        if (createdDate == null || createdDate.trim().isEmpty())
            throw new TaxDataException("createdDate required");
        if (updatedDate == null || updatedDate.trim().isEmpty())
            throw new TaxDataException("updatedDate required");
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }
    public String getCreatedDate() { return createdDate; }
    public String getUpdatedDate() { return updatedDate; }
}
