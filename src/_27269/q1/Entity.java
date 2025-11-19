package _27269.q1;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) {
        if (id <= 0) throw new IllegalArgumentException("id must be > 0");
        if (createdDate == null || createdDate.trim().isEmpty())
            throw new IllegalArgumentException("createdDate cannot be null/empty");
        if (updatedDate == null || updatedDate.trim().isEmpty())
            throw new IllegalArgumentException("updatedDate cannot be null/empty");
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }
    public String getCreatedDate() { return createdDate; }
    public String getUpdatedDate() { return updatedDate; }

    public void setUpdatedDate(String updatedDate) {
        if (updatedDate == null || updatedDate.trim().isEmpty())
            throw new IllegalArgumentException("updatedDate cannot be null/empty");
        this.updatedDate = updatedDate;
    }
}
