package _27269.q2;

public class Booking extends Passenger {
    private String bookingDate;
    private String seatNumber;
    private String travelClass; // Economy/Business/First

    public Booking(int id, String createdDate, String updatedDate,
                   String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail,
                   String flightNumber, String departure, String destination, double baseFare,
                   String pilotName, String licenseNumber, int experienceYears,
                   String crewName, String role, String shift,
                   String passengerName, int age, String gender, String contact,
                   String bookingDate, String seatNumber, String travelClass) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail,
              flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears,
              crewName, role, shift, passengerName, age, gender, contact);
        if (bookingDate == null || bookingDate.trim().isEmpty()) throw new IllegalArgumentException("bookingDate required");
        if (seatNumber == null || seatNumber.trim().isEmpty()) throw new IllegalArgumentException("seatNumber required");
        if (travelClass == null || !(travelClass.equalsIgnoreCase("Economy") || travelClass.equalsIgnoreCase("Business") || travelClass.equalsIgnoreCase("First")))
            throw new IllegalArgumentException("travelClass must be 'Economy', 'Business' or 'First'");
        this.bookingDate = bookingDate;
        this.seatNumber = seatNumber;
        this.travelClass = travelClass.substring(0,1).toUpperCase() + travelClass.substring(1).toLowerCase();
    }

    public String getBookingDate() { return bookingDate; }
    public String getSeatNumber() { return seatNumber; }
    public String getTravelClass() { return travelClass; }
}
