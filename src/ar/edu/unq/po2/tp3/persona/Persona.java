package ar.edu.unq.po2.tp3.persona;

import java.util.Calendar;
import java.util.Date;

public class Persona {
	
	private String nombre;
	private Date fechaDeNacimiento;
	
	public Persona(String nombre, Date fechaNac) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaNac;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public int edad() {
		Calendar fechaNacimiento = Calendar.getInstance();
		Calendar fechaActual = Calendar.getInstance();
		fechaNacimiento.setTime(fechaDeNacimiento);
		int año = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
		int mes = fechaActual.get(Calendar.MONTH) - fechaNacimiento.get(Calendar.MONTH);
		int dia = fechaActual.get(Calendar.DATE) - fechaNacimiento.get(Calendar.DATE);
		if (mes < 0 || (mes == 0 && dia < 0)) {
			año--;
		}
	return año;
	}
	
	public boolean menorQue(Persona persona) {
		return (this.edad() < persona.edad());
	}
	
}
