package Pruebas;

import java.sql.Date;

public abstract class Atencion {
	
	private Date fecha;
	private String descripcion;
	private float temperatura;
	private boolean tos;
	private boolean dificultadRespiratoria;

	abstract boolean esDeRiesgo();//Metodo abstracto
	

	public float getTemperatura() {
		return temperatura;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public void setTos(boolean tos) {
		this.tos = tos;
	}

	public void setDificultadRespiratoria(boolean dificultadRespiratoria) {
		this.dificultadRespiratoria = dificultadRespiratoria;
	}

	public boolean getTos() {
		return tos;
	}

	public boolean getDificultadRespiratoria() {
		return dificultadRespiratoria;
	}
	
	

}

	
