package SourceControl.Vuelo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import SourceControl.Horario.*;
import SourceControl.Asiento.*;

public class Vuelo {
    private String vueloId;
    private String origen;
    private String destino;
    private Horario horario;
    private Aerolinea aerolinea;
    private List<Asiento> asientos;

    public Vuelo(String vueloId, String origen, String destino, Horario horario, Aerolinea aerolinea, List<Asiento> asientos) {
        this.vueloId = vueloId;
        this.origen = origen;
        this.destino = destino;
        this.horario = horario;
        this.aerolinea = aerolinea;
        this.asientos = asientos != null ? asientos : new ArrayList<>();
    }
    //GETTERS
    public String getVueloId() {
        return vueloId;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Horario getHorario() {
        return horario;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }
    //SETTERS
    public void setVueloId(String vueloId) {
        this.vueloId = vueloId;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }

    public void setAsientos(List<Asiento> asientos) {
        this.asientos = asientos;
    }

    public void mostrarDisponibilidadAsientos() {
        System.out.println("Disponibilidad de Asientos en el Vuelo " + vueloId + ":");
        for (Asiento asiento : asientos) {
            System.out.println(asiento.toString());
        }
    }

    public static List<Vuelo> buscarVuelo(String destino, Date fecha, String clase, List<Vuelo> vuelosDisponibles) {
        List<Vuelo> vuelosEncontrados = new ArrayList<>();
        for (Vuelo vuelo : vuelosDisponibles) {
            if (vuelo.getDestino().equalsIgnoreCase(destino)
                    && vuelo.getHorario().getFechaSalida().equals(fecha)
                    && vuelo.tieneClaseDisponible(clase)) {
                vuelosEncontrados.add(vuelo);
            }
        }
        return vuelosEncontrados;
    }

    private boolean tieneClaseDisponible(String clase) {
        for (Asiento asiento : asientos) {
            if (asiento.getTipo().name().equalsIgnoreCase(clase) && asiento.isDisponible()) {
                return true;
            }
        }
        return false;
    }
}

