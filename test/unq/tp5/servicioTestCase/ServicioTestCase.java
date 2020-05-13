package unq.tp5.servicioTestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.factura.Servicio;

class ServicioTestCase {
	
	private Servicio servicio;

	@BeforeEach
	void setUp() throws Exception {
		servicio = new Servicio(12d, 3);  
	}

	@Test
	void testMontoAPagar() {
		assertEquals(36d, servicio.montoAPagar());
	}

}
