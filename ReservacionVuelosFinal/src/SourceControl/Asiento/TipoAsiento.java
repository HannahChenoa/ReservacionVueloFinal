package SourceControl.Asiento;

public enum TipoAsiento {
	DELANTERO,
	POSTERIOR,
	PRIMERA_CLASE,
	ECONOMICO;

	
	@Override
	public String toString() {
		switch (this) {
			case DELANTERO:
				return "Asiento Delantero";
			case POSTERIOR:
				return "Asiento Posterior";
			case PRIMERA_CLASE:
				return "Primera Clase";
			case ECONOMICO:
				return "Clase Económica";
			default:
				return "Tipo desconocido";
	        }
	    }	

}
