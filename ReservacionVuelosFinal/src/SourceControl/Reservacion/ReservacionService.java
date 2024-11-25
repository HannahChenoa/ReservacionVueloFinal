package SourceControl.Reservacion;
import SourceControl.Usuario.*;
import SourceControl.Vuelo.*;
import SourceControl.Asiento.*;

public interface ReservacionService {
	void reservarAsiento(Usuario usuario, Vuelo vuelo, Asiento asiento);
	void cancelarReservacion(String reservacionId);
	void confirmarReservacion(Reservacion reservacion);

}
