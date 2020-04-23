package unq.tp3.personaTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.persona.Persona;

class PersonaTestCase {

	Persona persona1;
	Persona persona2;
	
	@BeforeEach
	void setUp() throws Exception {
		Date fechaNac1 = new Date(100, 1, 29);
		Date fechaNac2 = new Date(98, 1, 29);
		persona1 = new Persona("Alejo", fechaNac1);
		persona2 = new Persona("Pablo", fechaNac2);
	}

	@Test
	void testNombre() {
		assertEquals("Alejo", persona1.getNombre());
	}
	
	@Test
	void testfechaNacimiento() {
		assertEquals(persona1.getFechaDeNacimiento(), (new Date(100, 1, 29)));
	}

	@Test
	void testEdad() {
		assertEquals(20, persona1.edad());
	}
	
	@Test
	void testMenorQue() {
		assertTrue(persona1.menorQue(persona2));
		assertFalse(persona2.menorQue(persona1));
	}
	
}
