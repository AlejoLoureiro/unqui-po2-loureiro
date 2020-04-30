package unq.tp4.trabajadorTestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.ingreso.Ingreso;
import ar.edu.unq.po2.tp4.ingreso.IngresoHorasExtra;
import ar.edu.unq.po2.tp4.trabajador.Trabajador;

class TrabajadorTestCase {
	
	private Trabajador trabajador;

	@BeforeEach
	void setUp() throws Exception {
		Ingreso sueldoEnero = new Ingreso("Enero", "Sueldo", 20000d);
		Ingreso sueldoFebrero = new Ingreso("Febrero", "Sueldo", 20000d);
		IngresoHorasExtra horasExtraFebrero = new IngresoHorasExtra("Febrero", "Horas Extra", 2000d, 8d);
		Ingreso sueldoMarzo = new Ingreso("Marzo", "Sueldo", 20000d);
		trabajador = new Trabajador();
		trabajador.agregarIngreso(sueldoEnero);
		trabajador.agregarIngreso(sueldoFebrero);
		trabajador.agregarIngreso(horasExtraFebrero);
		trabajador.agregarIngreso(sueldoMarzo);
	}
	
	@Test
	void testAgregarIngreso() {
		Ingreso sueldoAbril = new Ingreso("Abril", "Sueldo", 20000d);
		trabajador.agregarIngreso(sueldoAbril);
		// uso el getTotalPercibido() para testear porque no me interesa
		// tener un getter de la lista de ingresos
		assertEquals(80400d, trabajador.getTotalPercibido()); 
	}
	
	@Test
	void testGetTotalPercibido() {
	assertEquals(60800d, trabajador.getTotalPercibido());
	}

	@Test
	void testGetMontoImponible() {
		assertEquals(60000d, trabajador.getMontoImponible());
	}
	
	@Test
	void testGetImpuestoAPagar() {
		assertEquals(1200d, trabajador.getImpuestoAPagar());
	}
}