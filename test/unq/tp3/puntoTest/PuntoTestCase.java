package unq.tp3.puntoTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.punto.Punto;

class PuntoTestCase {
	
	private Punto punto1;
	private Punto punto2;
	
	@BeforeEach
	private void setUp() throws Exception {
		punto1 = new Punto(2,3);
		punto2 = new Punto(8,5);
	}

	@Test
	void testSinArgumentos() {
		Punto punto = new Punto();
		assertEquals(punto.getX(), 0);
		assertEquals(punto.getY(), 0);
	}
	
	@Test
	void testConArgumentos() {
		Punto punto = new Punto(2,3);
		assertEquals(punto.getX(), 2);
		assertEquals(punto.getY(), 3);
	}
	
	@Test
	void testMoverPunto() {
		punto1.moverPunto(5,4);
		assertEquals(punto1.getX(), 5);
		assertEquals(punto1.getY(), 4);
	}
	
	@Test
	void testSumarPuntos() {
		Punto punto3 = punto1.sumarPunto(punto2);
		assertEquals(punto3.getX(), 10);
		assertEquals(punto3.getY(), 8);
	}
	
}
