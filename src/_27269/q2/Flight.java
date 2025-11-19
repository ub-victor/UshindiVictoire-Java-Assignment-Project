package _27269.q2;

public class Flight extends Airline {
    private String flightNumber;
    private String departure;   // departure airport code or name
    private String destination; // destination airport code or name
    private double baseFare;    // > 0

    public Flight(int id, String createdDate, String updatedDate,
                  String airportName, String code, String location,
                  String airlineName, String airlineCode, String contactEmail,
                  String flightNumber, String departure, String destination, double baseFare) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail);
        if (flightNumber == null || flightNumber.trim().isEmpty()) throw new IllegalArgumentException("flightNumber required");
        if (departure == null || departure.trim().isEmpty()) throw new IllegalArgumentException("departure required");
        if (destination == null || destination.trim().isEmpty()) throw new IllegalArgumentException("destination required");
        if (baseFare <= 0) throw new IllegalArgumentException("baseFare must be > 0");
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.baseFare = baseFare;
    }

    public String getFlightNumber() { return flightNumber; }
    public String getDeparture() { return departure; }
    public String getDestination() { return destination; }
    public double getBaseFare() { return baseFare; }
}
