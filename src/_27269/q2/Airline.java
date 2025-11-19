package _27269.q2;

public class Airline extends Airport {
    private String airlineName;
    private String airlineCode; // 2-4 letters
    private String contactEmail;

    public Airline(int id, String createdDate, String updatedDate,
                   String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail) {
        super(id, createdDate, updatedDate, airportName, code, location);
        if (airlineName == null || airlineName.trim().isEmpty()) throw new IllegalArgumentException("airlineName required");
        if (airlineCode == null || !airlineCode.matches("[A-Za-z]{2,4}")) throw new IllegalArgumentException("airlineCode 2-4 letters");
        if (!isValidEmail(contactEmail)) throw new IllegalArgumentException("contactEmail invalid");
        this.airlineName = airlineName;
        this.airlineCode = airlineCode.toUpperCase();
        this.contactEmail = contactEmail;
    }

    private boolean isValidEmail(String e) {
        return e != null && e.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
    }

    public String getAirlineName() { return airlineName; }
    public String getAirlineCode() { return airlineCode; }
    public String getContactEmail() { return contactEmail; }
}
