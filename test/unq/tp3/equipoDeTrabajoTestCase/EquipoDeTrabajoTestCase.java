package unq.tp3.equipoDeTrabajoTestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.equipoDeTrabajo.EquipoDeTrabajo;
import ar.edu.unq.po2.tp3.equipoDeTrabajo.Persona;

class EquipoDeTrabajoTestCase {

	private EquipoDeTrabajo equipoDeTrabajo;
	private Persona alejo;
	private Persona iñaki;
	private Persona mauro;
	private Persona juan;
	private Persona melina;
	
	@BeforeEach
	void setUp() throws Exception {
		alejo = new Persona("Alejo", "Loureiro", 20);
		iñaki = new Persona("Iñaki", "Diaz", 21);
		mauro = new Persona("Mauro", "Bosseti", 25);
		juan = new Persona("Juan", "Stafora", 19);
		melina = new Persona("Melina", "Uribarri", 24);
		equipoDeTrabajo = new EquipoDeTrabajo("Java");
		equipoDeTrabajo.agregarIntegrante(alejo);
		equipoDeTrabajo.agregarIntegrante(iñaki);
		equipoDeTrabajo.agregarIntegrante(mauro);
		equipoDeTrabajo.agregarIntegrante(juan);
		equipoDeTrabajo.agregarIntegrante(melina);
	}

	@Test
	void testPromedioEdades() {
		assertEquals(22, equipoDeTrabajo.promedioEdades());
		System.out.println(equipoDeTrabajo.promedioEdades());
	}

}
