package SourceControl.Reservacion;
import SourceControl.Usuario.*;
import SourceControl.Vuelo.*;
import SourceControl.Asiento.*;

import java.util.Date;

public class Reservacion {
	
	private String reservacionId;
	private Usuario usuario;
	private Vuelo vuelo;
	private Asiento asiento;
	private Date fechaReservacion;
	private String estado;
	
	public Reservacion(String reservacionId,Usuario usuario,Vuelo vuelo,Asiento asiento) {
		
		this.reservacionId = reservacionId;
		this.usuario = usuario;
		this.vuelo = vuelo;
		this.asiento = asiento;
		this.fechaReservacion = new Date();
		
	}
	
	public void confirmarReservacion() {
		if(!estado.equals("confirmado")) {
			asiento.actualizarDisponibilidad(true); // asiento como  ocupado
			estado = "confirmado";
			System.out.println("Reservación confirmada para el vuelo " + vuelo.getVueloId() + " en el asiento " + asiento.getNumeroAsiento());
		}else {
			System.out.println("La reservacion ya esta confirmada");
		}
	}
	
	public void cancelarReservacion() {
		if(estado.equals("confirmado")) {
			asiento.actualizarDisponibilidad(false);// asiento como libre
			estado = "cancelada";
			System.out.println("Reservación cancelada para el vuelo " + vuelo.getVueloId() + " en el asiento " + asiento.getNumeroAsiento());
		}else {
			System.out.println("La reservación no está confirmada o ya ha sido cancelada.");
		}
	}
	
	public String mostrarDetallesReservacion() {
		return "Reservación ID: " + reservacionId + "\n" +
	               "Usuario: " + usuario.getNombre() + "\n" +
	               "Vuelo: " + vuelo.getVueloId() + "\n" +
	               "Origen: " + vuelo.getOrigen() + "\n" +
	               "Destino: " + vuelo.getDestino() + "\n" +
	               "Asiento: " + asiento.getNumeroAsiento() + " (" + asiento.getTipo() + ")\n" +
	               "Fecha de Reservación: " + fechaReservacion + "\n" +
	               "Estado: " + estado;
		
	}
	
	public String getEstado() {
		return estado;
	}
	
	

}
