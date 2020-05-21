package unq.tp6.bancoTestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.banco.Banco;
import ar.edu.unq.po2.tp6.cliente.Cliente;
import ar.edu.unq.po2.tp6.propiedad.PropiedadInmobiliaria;

class BancoTestCase {
	
	private Banco banco;
	private Cliente alejo;
	private Cliente pablo;
	private Cliente claudia;
	private PropiedadInmobiliaria alejoPropiedad;

	@BeforeEach
	void setUp() throws Exception {
		banco = new Banco();
		alejoPropiedad = new PropiedadInmobiliaria("Casa de 3 habitaciones", "Lamadrid 238", 150000d);
		alejo = new Cliente("Alejo", "Loureiro", "Lamadrid 832", 19, 30000d);
		pablo = new Cliente("Pablo", "Diaz", "Cerrito 150", 25, 12000d);
		claudia = new Cliente("Caludia", "Grasso", "Lamadrid 832", 40, 75000d);
		banco.agregarNuevoCliente(alejo);
		banco.agregarNuevoCliente(pablo);
		alejo.agregarPropiedad(alejoPropiedad);
		alejo.serClienteDe(banco);
		pablo.serClienteDe(banco);
		claudia.serClienteDe(banco);
		alejo.solicitarCreditoHipotecario(6000d,6, alejoPropiedad);
		pablo.solicitarCreditoPersonal(120000d,8);
		claudia.solicitarCreditoPersonal(10000d,6);
	}

	@Test
	void testAgregarNuevoCliente() {
		assertEquals(2, banco.cantidadDeClientes());
	}

	@Test
	void testRegistrarSolicitudDeCredito() {
		assertEquals(3, banco.cantidadDeSolicitudes());
	}
	
	@Test
	void testMontoADesembolsar() {
		assertEquals(16000d, banco.montoADesembolsar());
	}
}
