package _27269.q2;

public class Airport extends Entity {
    private String airportName;
    private String code; // 3 uppercase letters
    private String location;

    public Airport(int id, String createdDate, String updatedDate,
                   String airportName, String code, String location) {
        super(id, createdDate, updatedDate);
        if (airportName == null || airportName.trim().isEmpty()) throw new IllegalArgumentException("airportName required");
        if (code == null || !code.matches("[A-Z]{3}")) throw new IllegalArgumentException("code must be 3 uppercase letters");
        if (location == null || location.trim().isEmpty()) throw new IllegalArgumentException("location required");
        this.airportName = airportName;
        this.code = code;
        this.location = location;
    }

    public String getAirportName() { return airportName; }
    public String getCode() { return code; }
    public String getLocation() { return location; }
}
