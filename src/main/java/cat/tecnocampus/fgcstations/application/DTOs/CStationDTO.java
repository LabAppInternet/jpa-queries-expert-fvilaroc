package cat.tecnocampus.fgcstations.application.DTOs;

public class CStationDTO implements StationDTO {

    private String name;
    private String longitud;
    private String latitud;

    public CStationDTO(String name, String longitud, String latitud) {
        this.name = name;
        this.longitud = longitud;
        this.latitud = latitud;
    }
    @Override
    public String getName() {return name;}

    @Override
    public String getLongitud() {return longitud;}

    @Override
    public String getLatitud() {return latitud;}

    public void setName(String n) {
        name = n;
    }

    public void setLongitud(String lo) {
        longitud = lo;
    }

    public void setLatitud(String la) {
        latitud = la;
    }
}
