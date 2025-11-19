package _27269.q2;

public class Pilot extends Flight {
    private String pilotName;
    private String licenseNumber;
    private int experienceYears; // >= 2

    public Pilot(int id, String createdDate, String updatedDate,
                 String airportName, String code, String location,
                 String airlineName, String airlineCode, String contactEmail,
                 String flightNumber, String departure, String destination, double baseFare,
                 String pilotName, String licenseNumber, int experienceYears) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail,
              flightNumber, departure, destination, baseFare);
        if (pilotName == null || pilotName.trim().isEmpty()) throw new IllegalArgumentException("pilotName required");
        if (licenseNumber == null || licenseNumber.trim().isEmpty()) throw new IllegalArgumentException("licenseNumber required");
        if (experienceYears < 2) throw new IllegalArgumentException("experienceYears must be >= 2");
        this.pilotName = pilotName;
        this.licenseNumber = licenseNumber;
        this.experienceYears = experienceYears;
    }

    public String getPilotName() { return pilotName; }
    public String getLicenseNumber() { return licenseNumber; }
    public int getExperienceYears() { return experienceYears; }
}
