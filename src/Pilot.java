public class Pilot {
    private int id;
     private String name;
     private  String experiencelevel;
     private String aircraftType;


    public Pilot( int id, String name, String experiencelevel, String aircraftType ) {
        this.id = id;
        this.name = name;
        this.experiencelevel = experiencelevel;
        this.aircraftType = aircraftType;
    }

    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getExperiencelevel() {
        return experiencelevel;
    }

    public void setExperiencelevel( String experiencelevel ) {
        this.experiencelevel = experiencelevel;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType( String aircraftType ) {
        this.aircraftType = aircraftType;
    }
}
