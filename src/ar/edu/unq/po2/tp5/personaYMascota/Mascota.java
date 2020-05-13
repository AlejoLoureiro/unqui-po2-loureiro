package ar.edu.unq.po2.tp5.personaYMascota;

public class Mascota implements SerVivoConNombre {

	private String raza;
	private String nombre;
	
	public Mascota(String nombre, String raza) {
		this.nombre = nombre;
		this.raza = raza;
	}
	
	public String getRaza() {
		return raza;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

}
