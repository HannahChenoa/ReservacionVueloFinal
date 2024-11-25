package SourceControl.Horario;
import java.util.Date;

public class Horario {
    private Date fechaSalida;
    private Date fechaLlegada;
    private String horaSalida;
    private String horaLlegada;

    public Horario(Date fechaSalida, Date fechaLlegada, String horaSalida, String horaLlegada) {
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void actualizarHorario(Date nuevaFechaSalida, Date nuevaFechaLlegada, String nuevaHoraSalida, String nuevaHoraLlegada) {
        this.fechaSalida = nuevaFechaSalida;
        this.fechaLlegada = nuevaFechaLlegada;
        this.horaSalida = nuevaHoraSalida;
        this.horaLlegada = nuevaHoraLlegada;
        System.out.println("Horario actualizado exitosamente.");
    }

    @Override
    public String toString() {
        return "Horario [Fecha Salida: " + fechaSalida + ", Fecha Llegada: " + fechaLlegada +
               ", Hora Salida: " + horaSalida + ", Hora Llegada: " + horaLlegada + "]";
    }
}


