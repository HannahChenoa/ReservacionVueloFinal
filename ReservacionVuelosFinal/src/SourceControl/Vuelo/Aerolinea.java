package SourceControl.Vuelo;


public class Aerolinea {
    private int id;
    private String nombre;
    private String logoPath;

    public Aerolinea(int id, String nombre, String logoPath) {
        this.id = id;
        this.nombre = nombre;
        this.logoPath = logoPath;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLogoPath() {
        return logoPath;
    }
}


