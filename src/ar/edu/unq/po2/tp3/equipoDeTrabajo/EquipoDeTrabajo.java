package ar.edu.unq.po2.tp3.equipoDeTrabajo;

import java.util.ArrayList;

public class EquipoDeTrabajo {

	private String nombre;	
	private ArrayList<Persona> integrantes;
		
	public EquipoDeTrabajo(String nombre) {
		this.nombre = nombre;
		this.integrantes = new ArrayList<Persona>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void agregarIntegrante(Persona integrante) {
		integrantes.add(integrante);
	}
	
	public float promedioEdades() {
		Integer totalEdades = 0;
		for (Persona integrante:integrantes) {
			totalEdades += integrante.edad();
		}
		// Math.round para redondear el promedio de edades.
		int promedio = Math.round((float)totalEdades/integrantes.size());
		return promedio;
	}
}
