package _27269.q2;

/**
 * Final class. Implements calculateFare() and prints ticket details.
 */
public final class Ticket extends Payment {
    private String ticketNumber;
    private String issueDate;

    public Ticket(int id, String createdDate, String updatedDate,
                  String airportName, String code, String location,
                  String airlineName, String airlineCode, String contactEmail,
                  String flightNumber, String departure, String destination, double baseFare,
                  String pilotName, String licenseNumber, int experienceYears,
                  String crewName, String role, String shift,
                  String passengerName, int age, String gender, String contact,
                  String bookingDate, String seatNumber, String travelClass,
                  String paymentDate, String paymentMethod, double amountPaid,
                  String ticketNumber, String issueDate) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail,
              flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears,
              crewName, role, shift, passengerName, age, gender, contact, bookingDate, seatNumber, travelClass,
              paymentDate, paymentMethod, amountPaid);
        if (ticketNumber == null || ticketNumber.trim().isEmpty()) throw new IllegalArgumentException("ticketNumber required");
        if (issueDate == null || issueDate.trim().isEmpty()) throw new IllegalArgumentException("issueDate required");
        this.ticketNumber = ticketNumber;
        this.issueDate = issueDate;
    }

    /**
     * calculateFare = baseFare + taxes - discounts
     * - taxes: 15% of baseFare
     * - discount: depending on travelClass: Economy 0, Business 5% of baseFare, First 10% of baseFare
     */
    public double calculateFare() {
        double base = getBaseFare();
        double taxes = 0.15 * base;
        double discount = 0;
        String cls = getTravelClass();
        if (cls.equalsIgnoreCase("Business")) discount = 0.05 * base;
        else if (cls.equalsIgnoreCase("First")) discount = 0.10 * base;
        return base + taxes - discount;
    }

    public void printTicket() {
        String p = "27269 - ";
        System.out.println(p + "----- TICKET -----");
        System.out.println(p + "Ticket No: " + ticketNumber);
        System.out.println(p + "Issue Date: " + issueDate);
        System.out.println(p + "Passenger: " + getPassengerName() + " (Age: " + getAge() + ", " + getGender() + ")");
        System.out.println(p + "Flight: " + getFlightNumber() + " [" + getDeparture() + " -> " + getDestination() + "]");
        System.out.println(p + "Airline: " + getAirlineName() + " (" + getAirlineCode() + ")");
        System.out.println(p + "Seat: " + getSeatNumber() + " Class: " + getTravelClass());
        System.out.printf(p + "Fare (calculated): %.2f%n", calculateFare());
        System.out.println(p + "Payment Method: " + getPaymentMethod() + " Amount Paid: " + getAmountPaid());
        System.out.println(p + "Contact: " + getContact());
        System.out.println(p + "-------------------");
    }

    public String getTicketNumber() { return ticketNumber; }
    public String getIssueDate() { return issueDate; }
}
