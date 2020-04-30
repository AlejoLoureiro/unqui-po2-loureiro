package unq.tp4.ingresoTestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.ingreso.IngresoHorasExtra;

class IngresoHorasExtraTestCase {
	
	private IngresoHorasExtra horasExtraMayo;
	
	@BeforeEach
	void setUp() throws Exception {
		horasExtraMayo = new IngresoHorasExtra("Mayo", "Horas Extra", 4000d, 5d);
	}

	@Test
	void testGetMesPercepcion() {
		assertEquals("Mayo", horasExtraMayo.getMesPercepcion());
	}

	@Test
	void testGetConcepto() {
		assertEquals("Horas Extra", horasExtraMayo.getConcepto());
	}
	
	@Test
	void testGetMonto() {
		assertEquals(4000d, horasExtraMayo.getMonto());
	}
	@Test
	void testGetEsImponible() {
		assertEquals(false, horasExtraMayo.getEsImponible());
	}
	
}
