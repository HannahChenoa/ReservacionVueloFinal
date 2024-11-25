package SourceControl.Usuario;

import SourceControl.Pago.*;
public class Cliente extends Usuario {
    private int telefono;
    private String pais;
    private String ciudad;

    // Constructor
    public Cliente(String username, String email, String contraseña, String nombre, String apellido, 
                   int telefono, String pais, String ciudad) {
        super(username, email, contraseña, apellido, nombre);
        this.telefono = telefono;
        this.pais = pais;
        this.ciudad = ciudad;
    }

    // GETTERS
    public int getTelefono() {
        return telefono;
    }

    public String getCiudad() {
        return ciudad;
    }
    public String getPais() {
        return pais;
    }
    
    //SETTERS
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    // Implementación del método abstracto 'registrar'
    @Override
    public void registrar() {
        System.out.println("Registrando cliente...");
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        System.out.println("Email: " + getEmail());
        System.out.println("Teléfono: " + telefono);
        System.out.println("País: " + pais);
        System.out.println("Ciudad: " + ciudad);
    }

    // Implementación del método abstracto 'iniciarSesion'
    @Override
    public boolean iniciarSesion(String email, String contraseña) {
        if (this.getEmail().equals(email) && this.getContraseña().equals(contraseña)) {
            System.out.println("Inicio de sesión exitoso para el cliente: " + getUsername());
            return true;
        }
        System.out.println("Error: Email o contraseña incorrectos.");
        return false;
    }

    // Método para registrar un pago
    public void registrarPago(Pago metodo) {
        System.out.println("Registrando pago para el cliente: " + getUsername());
        System.out.println("Método de pago: " + metodo.getTipoPago());
        metodo.procesarPago();
    }

    // Representación textual de Cliente
    @Override
    public String toString() {
        return "Cliente [Username: " + getUsername() + ", Nombre: " + getNombre() + " " + getApellido() +
               ", Email: " + getEmail() + ", Teléfono: " + telefono + ", País: " + pais + ", Ciudad: " + ciudad + "]";
    }
}

