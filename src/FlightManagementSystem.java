import java.util.Collections;
import java.util.List;

public class FlightManagementSystem {

    public static void main( String[] args ) {
        // Creating an airline and an aircraft
        Airline airline = new Airline(1, "Example Airlines", true);
        Aircraft aircraft = new Aircraft(1, "Boeing 737", airline);
        airline.getAircrafts(aircraft);

        // Creating a pilot and assigning them to the aircraft
        Pilot pilots = new Pilot(1, "John Doe", "Experienced", "Boeing 737");
        aircraft.setPilots(Collections.singletonList(pilots));


        // Checking the initial operational status of the aircraft
        System.out.println("Aircraft initial operational status: " + aircraft.isOperational());

        // Performing maintenance on the aircraft
        aircraft.getAirline();

        // Checking the operational status of the aircraft after maintenance
        System.out.println("Aircraft operational status after maintenance: " + aircraft.isOperational());

        // Removing the pilot from the aircraft

        aircraft.getPilots(pilots);

        System.out.println("Aircraft operational status after removing pilot: " + aircraft.isOperational());


    }
}