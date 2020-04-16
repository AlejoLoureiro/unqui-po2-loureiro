package Pruebas;

import java.sql.Date;
import java.util.ArrayList;

public class HistoriaClinica {
	
	private String nombre;
	private String apellido;
	private Date fechaDeNacimiento;
	private ArrayList<Atencion> atenciones;

	public HistoriaClinica(String nombre, String apellido, Date fechaDeNacimiento) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setFechaDeNacimiento(fechaDeNacimiento);
		this.setAtenciones(new ArrayList());
	}

	public ArrayList getAtenciones() {
		return atenciones;
	}

	public void setAtenciones(ArrayList atenciones) {
		this.atenciones = atenciones;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
}
