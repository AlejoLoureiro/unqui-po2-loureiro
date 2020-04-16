package Pruebas;

import java.sql.Date;

public class AtencionGuardia extends Atencion {

	@Override
	boolean esDeRiesgo() {
		return (this.getTos() || this.getDificultadRespiratoria()) && this.getTemperatura() > 38;
	}
	
	public AtencionGuardia(Date fecha, String dscr, float temp, boolean tos, boolean difResp) {
		this.setFecha(fecha);
		this.setDescripcion(dscr);
		this.setTemperatura(temp);
		this.setTos(tos);
		this.setDificultadRespiratoria(difResp);	
	}
}
