package SourceControl.Pago;

public class Pago {
    private String tipoPago;

    public Pago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void procesarPago() {
        System.out.println("Procesando el pago con " + tipoPago + "...");
    }
}

