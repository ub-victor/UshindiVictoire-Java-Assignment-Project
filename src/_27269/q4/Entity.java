package _27269.q4;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) {
        if (id <= 0) throw new IllegalArgumentException("ID > 0 required");
        if (createdDate == null || createdDate.trim().isEmpty())
            throw new IllegalArgumentException("createdDate required");
        if (updatedDate == null || updatedDate.trim().isEmpty())
            throw new IllegalArgumentException("updatedDate required");

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }
    public String getCreatedDate() { return createdDate; }
    public String getUpdatedDate() { return updatedDate; }
}
