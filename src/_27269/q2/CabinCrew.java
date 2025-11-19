package _27269.q2;

public class CabinCrew extends Pilot {
    private String crewName;
    private String role;
    private String shift; // "Day" or "Night"

    public CabinCrew(int id, String createdDate, String updatedDate,
                     String airportName, String code, String location,
                     String airlineName, String airlineCode, String contactEmail,
                     String flightNumber, String departure, String destination, double baseFare,
                     String pilotName, String licenseNumber, int experienceYears,
                     String crewName, String role, String shift) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail,
              flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears);
        if (crewName == null || crewName.trim().isEmpty()) throw new IllegalArgumentException("crewName required");
        if (role == null || role.trim().isEmpty()) throw new IllegalArgumentException("role required");
        if (shift == null || !(shift.equalsIgnoreCase("Day") || shift.equalsIgnoreCase("Night")))
            throw new IllegalArgumentException("shift must be 'Day' or 'Night'");
        this.crewName = crewName;
        this.role = role;
        this.shift = shift.substring(0,1).toUpperCase() + shift.substring(1).toLowerCase();
    }

    public String getCrewName() { return crewName; }
    public String getRole() { return role; }
    public String getShift() { return shift; }
}
