package Pruebas;

import java.sql.Date;

public class AtencionInternacion extends Atencion {

	private boolean esDeRiesgo;
	
	@Override
	boolean esDeRiesgo() {
		return this.esDeRiesgo;
	}
	
	void setEsDeRiesgo(boolean riesgo) {
		this.esDeRiesgo = riesgo;	
	}

	public AtencionInternacion(Date fecha, String dscr, float temp, boolean tos, boolean difResp, boolean riesgo) {
		this.setFecha(fecha);
		this.setDescripcion(dscr);
		this.setTemperatura(temp);
		this.setTos(tos);
		this.setDificultadRespiratoria(difResp);
		this.setEsDeRiesgo(riesgo);
	}
}
