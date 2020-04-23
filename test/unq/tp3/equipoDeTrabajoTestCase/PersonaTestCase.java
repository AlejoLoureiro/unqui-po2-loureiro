package unq.tp3.equipoDeTrabajoTestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.equipoDeTrabajo.Persona;

class PersonaTestCase {

	private Persona alejoLoureiro;
	
	@BeforeEach
	void setUp() throws Exception {
		alejoLoureiro = new Persona("Alejo", "Loureiro", 20);
	}

	@Test
	void testEdad() {
		assertEquals(alejoLoureiro.edad(), 20);
	}
	
	@Test
	void testNombreCompleto() {
		assertEquals(alejoLoureiro.nombreCompleto(), "AlejoLoureiro");
	}

}
