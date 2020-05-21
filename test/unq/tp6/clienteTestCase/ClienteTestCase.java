package unq.tp6.clienteTestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.banco.Banco;
import ar.edu.unq.po2.tp6.cliente.Cliente;
import ar.edu.unq.po2.tp6.propiedad.PropiedadInmobiliaria;

class ClienteTestCase {

	private Banco banco;
	private Cliente alejo;
	private Cliente pablo;
	private Cliente claudia;
	private Cliente sol;
	
	@BeforeEach
	void setUp() throws Exception {
		banco = new Banco();
		alejo = new Cliente("Alejo", "Loureiro", "Lamadrid 832", 20, 30000d);
		pablo = new Cliente("Pablo", "Diaz", "Cerrito 32", 49, 12000d);
		claudia = new Cliente("Claudia", "Grasso", "Lamadrid 832", 32, 60000d);
		sol = new Cliente("Sol", "Almeida", "Lebenson 332", 20, 40000d);
	}

	@Test
	void testConstructor() {
		assertEquals(20, alejo.getEdad());
		assertEquals(30000d, alejo.getSueldoNeto());
		assertEquals("Alejo", alejo.getNombre());
		assertEquals("Loureiro", alejo.getApellido());
	}
	
	@Test
	void testIngresosAnuales() {
		assertEquals(360000d, alejo.ingresosAnuales());
	}
	
	@Test
	void testSerClienteDe() {
		alejo.serClienteDe(banco);
		assertTrue(banco == alejo.getBanco());
	}

	@Test
	void testAgregarPropiedad() {
		PropiedadInmobiliaria propiedad = new PropiedadInmobiliaria("Casa", "Lamadrid", 123000d); 
		alejo.agregarPropiedad(propiedad);
		assertEquals(1, alejo.cantidadDePropiedades());
	}
	
}
