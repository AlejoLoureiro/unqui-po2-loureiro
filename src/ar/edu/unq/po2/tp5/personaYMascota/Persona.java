package ar.edu.unq.po2.tp5.personaYMascota;

import java.util.Date;

public class Persona implements SerVivoConNombre {

	private Date fechaDeNacimiento;
	private String nombre;
	
	public Persona(String nombre, Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.nombre = nombre; 
	}
	
	@Override
	public String getNombre() {
		return nombre;
	}
	
	public Date getNacimiento() {
		return fechaDeNacimiento;
	}

}
