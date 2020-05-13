package unq.tp5.impuestoTestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.factura.Impuesto;

class ImpuestoTestCase {
	
	private Impuesto impuesto;

	@BeforeEach
	void setUp() throws Exception {
		impuesto = new Impuesto(40d);
	}

	@Test
	void testMontoAPagar() {
		assertEquals(40d, impuesto.montoAPagar());
	}

}
