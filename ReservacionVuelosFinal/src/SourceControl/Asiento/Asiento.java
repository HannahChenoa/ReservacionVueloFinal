package SourceControl.Asiento;

public class Asiento {
    private String numeroAsiento; // Número identificador del asiento
    private TipoAsiento tipo;     // Tipo del asiento (económico, primera clase, etc.)
    private boolean ocupado;      // Indica si el asiento está ocupado o disponible

    // Constructor
    public Asiento(String numeroAsiento, TipoAsiento tipo, boolean ocupado) {
        this.numeroAsiento = numeroAsiento;
        this.tipo = tipo;
        this.ocupado = ocupado;
    }

    // Getters
    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public TipoAsiento getTipo() {
        return tipo;
    }

    public boolean isDisponible() {
        return !ocupado; // Devuelve true si el asiento no está ocupado
    }

    // Setters
    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public void setTipo(TipoAsiento tipo) {
        this.tipo = tipo;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    // Método para actualizar la disponibilidad del asiento
    public void actualizarDisponibilidad(boolean disponibilidad) {
        this.ocupado = !disponibilidad; // Si el asiento está disponible, no está ocupado
        System.out.println("La disponibilidad del asiento " + numeroAsiento + " ha sido actualizada a " + (disponibilidad ? "disponible" : "ocupado"));
    }

    // Representación textual del asiento
    @Override
    public String toString() {
        return "Asiento [Número: " + numeroAsiento + ", Tipo: " + tipo + ", Estado: " + (ocupado ? "Ocupado" : "Disponible") + "]";
    }
}


