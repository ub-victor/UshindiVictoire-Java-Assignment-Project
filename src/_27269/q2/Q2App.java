package _27269.q2;

import java.util.Scanner;

/**
 * Interactive runner for Q2 Flight Booking System.
 *
 * Run:
 *   javac src/_27269/q2/*.java
 *   java -cp src _27269.q2.Q2App
 */
public class Q2App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("27269 - Welcome to Q2: Flight Booking interactive runner.");

            System.out.print("27269 - Enter entity id (>0): ");
            int id = Integer.parseInt(sc.nextLine().trim());

            System.out.print("27269 - Created date (YYYY-MM-DD): ");
            String createdDate = sc.nextLine().trim();

            System.out.print("27269 - Updated date (YYYY-MM-DD): ");
            String updatedDate = sc.nextLine().trim();

            System.out.print("27269 - Airport name: ");
            String airportName = sc.nextLine().trim();

            System.out.print("27269 - Airport code (3 uppercase letters): ");
            String airportCode = sc.nextLine().trim().toUpperCase();

            System.out.print("27269 - Airport location: ");
            String airportLocation = sc.nextLine().trim();

            System.out.print("27269 - Airline name: ");
            String airlineName = sc.nextLine().trim();

            System.out.print("27269 - Airline code (2-4 letters): ");
            String airlineCode = sc.nextLine().trim();

            System.out.print("27269 - Airline contact email: ");
            String airlineEmail = sc.nextLine().trim();

            System.out.print("27269 - Flight number: ");
            String flightNumber = sc.nextLine().trim();

            System.out.print("27269 - Departure (airport/code): ");
            String departure = sc.nextLine().trim();

            System.out.print("27269 - Destination (airport/code): ");
            String destination = sc.nextLine().trim();

            System.out.print("27269 - Base fare (>0): ");
            double baseFare = Double.parseDouble(sc.nextLine().trim());

            System.out.print("27269 - Pilot name: ");
            String pilotName = sc.nextLine().trim();

            System.out.print("27269 - Pilot license number: ");
            String licenseNumber = sc.nextLine().trim();

            System.out.print("27269 - Pilot experience years (>=2): ");
            int exp = Integer.parseInt(sc.nextLine().trim());

            System.out.print("27269 - Cabin crew name: ");
            String crewName = sc.nextLine().trim();

            System.out.print("27269 - Cabin crew role: ");
            String crewRole = sc.nextLine().trim();

            System.out.print("27269 - Cabin crew shift (Day/Night): ");
            String shift = sc.nextLine().trim();

            System.out.print("27269 - Passenger name: ");
            String passengerName = sc.nextLine().trim();

            System.out.print("27269 - Passenger age (>0): ");
            int pAge = Integer.parseInt(sc.nextLine().trim());

            System.out.print("27269 - Passenger gender: ");
            String pGender = sc.nextLine().trim();

            System.out.print("27269 - Passenger contact: ");
            String pContact = sc.nextLine().trim();

            System.out.print("27269 - Booking date (YYYY-MM-DD): ");
            String bookingDate = sc.nextLine().trim();

            System.out.print("27269 - Seat number: ");
            String seatNumber = sc.nextLine().trim();

            System.out.print("27269 - Travel class (Economy/Business/First): ");
            String travelClass = sc.nextLine().trim();

            System.out.print("27269 - Payment date (YYYY-MM-DD): ");
            String paymentDate = sc.nextLine().trim();

            System.out.print("27269 - Payment method: ");
            String paymentMethod = sc.nextLine().trim();

            // We'll compute required fare via Ticket.calculateFare() but need an amountPaid for Payment
            System.out.print("27269 - Amount paid (must be >0): ");
            double amountPaid = Double.parseDouble(sc.nextLine().trim());

            System.out.print("27269 - Ticket number: ");
            String ticketNumber = sc.nextLine().trim();

            String issueDate = java.time.LocalDate.now().toString();

            // Build Ticket object
            Ticket ticket = new Ticket(
                    id, createdDate, updatedDate,
                    airportName, airportCode, airportLocation,
                    airlineName, airlineCode, airlineEmail,
                    flightNumber, departure, destination, baseFare,
                    pilotName, licenseNumber, exp,
                    crewName, crewRole, shift,
                    passengerName, pAge, pGender, pContact,
                    bookingDate, seatNumber, travelClass,
                    paymentDate, paymentMethod, amountPaid,
                    ticketNumber, issueDate
            );

            // Print ticket; ticket.printTicket() prefixes each line with 27269
            ticket.printTicket();

            System.out.println("27269 - Q2 interactive session completed.");

        } catch (Exception ex) {
            System.out.println("27269 - ERROR: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
