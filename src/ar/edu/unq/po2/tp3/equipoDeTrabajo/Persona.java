package ar.edu.unq.po2.tp3.equipoDeTrabajo;

//Esta es la definicion de persona del punto 9 ya que la definicion del punto 8 es diferente. 
//La definicion de persona del punto 8 esta en el paquete persona.

public class Persona {
	
	private String nombre;
	private String apellido;
	private Integer edad;
	
	public Persona(String nombre, String apellido, Integer edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public Integer edad() {
		return edad;
	}
	
	public String nombreCompleto() {
		return nombre + apellido;
	}
	
	
	
}
