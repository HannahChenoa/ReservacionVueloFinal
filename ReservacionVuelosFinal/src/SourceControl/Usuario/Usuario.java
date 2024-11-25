package SourceControl.Usuario;
import SourceControl.Vuelo.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
	private String username;
	private String email;
	private String contraseña;
	private String nombre;
	private String apellido;
	private List<Vuelo> historialVuelos;
	
	
	public Usuario(String username, String email, String contraseña, String apellido, String nombre) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.username= username;
		this.contraseña = contraseña;
		this.email= email;
		this.historialVuelos = new ArrayList<>();
		
	}
	//GETTERS
	public String getUsername() {
		return username;
	}
	public String getContraseña() {
		return contraseña;
	}
	public String getEmail() {
		return email;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public List<Vuelo> getHistorialVuelos(){
		return historialVuelos;
	}
	//Setters
	public void setUsername(String username) {
		this.username=username;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setApellido(String apellido) {
		this.apellido=apellido;
	}
	public void setHistorialVuelos(List<Vuelo> historialVuelos) {
		this.historialVuelos=historialVuelos;
	}
	
	// Método para consultar el historial de vuelos
    public List<Vuelo> consultarHistorial() {
        return historialVuelos;
    }
	
	public abstract void registrar();
	public abstract boolean iniciarSesion(String email, String contraseña);

	

}
