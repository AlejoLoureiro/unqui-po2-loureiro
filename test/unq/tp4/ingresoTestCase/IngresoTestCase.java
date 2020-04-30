package unq.tp4.ingresoTestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.ingreso.Ingreso;

class IngresoTestCase {
	
	private Ingreso sueldoMayo;

	@BeforeEach
	void setUp() throws Exception {
		sueldoMayo = new Ingreso("Mayo", "Sueldo", 40000d);
	}

	@Test
	void testGetMesPercepcion() {
		assertEquals("Mayo", sueldoMayo.getMesPercepcion());
	}

	@Test
	void testGetConcepto() {
		assertEquals("Sueldo", sueldoMayo.getConcepto());
	}
	
	@Test
	void testGetMonto() {
		assertEquals(40000d, sueldoMayo.getMonto());
	}
	@Test
	void testGetEsImponible() {
		assertEquals(true, sueldoMayo.getEsImponible());
	}
}
