import java.util.ArrayList;
import java.util.List;

public class Airline {
    private int id;

    private String name;
    private List<Airline> aircrafts;
    private boolean operationalStatus;

    public Airline( int id, String name, boolean operationalStatus ) {
        this.id = id;
        this.name = name;

        this.operationalStatus = operationalStatus;
    }

    public void setOperationalStatus(boolean status) {
        this.operationalStatus = status;
    }

    public void performMaintenance() {
        this.operationalStatus = true;
    }

    public int getId( Pilot pilots ) {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public List<Airline> getAircrafts( Aircraft aircraft ) {
        return aircrafts;
    }

    public void setAircrafts( List<Airline> aircrafts ) {
        this.aircrafts = aircrafts;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public List<Airline> getAircrafts() {
        return aircrafts;
    }

    public boolean isOperationalStatus() {
        return operationalStatus;
    }
}