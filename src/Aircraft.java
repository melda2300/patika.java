import java.util.ArrayList;
import java.util.List;

public class Aircraft {
    private int id;
    private String type;
    private boolean isOporotional;
    private Airline airline;
    private List<Pilot>pilots;
    private boolean operational;

    public Aircraft( int id, String type, Airline airline ) {
        this.id = id;
        this.type = type;
        this.isOporotional = isOporotional;
        this.airline = airline;
        this.pilots = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType( String type ) {
        this.type = type;
    }

    public boolean isOporotional() {
        return isOporotional;
    }

    public void setOporotional( boolean oporotional ) {
        isOporotional = oporotional;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline( Airline airline ) {
        this.airline = airline;
    }

    public List<Pilot> getPilots( Pilot pilot1 ) {
        return pilots;
    }

    public void setPilots( List<Pilot> pilots ) {
        this.pilots = pilots;
    }

    public boolean isOperational() {
        return operational;
    }

    public void setOperational( boolean operational ) {
        this.operational = operational;
    }
}
