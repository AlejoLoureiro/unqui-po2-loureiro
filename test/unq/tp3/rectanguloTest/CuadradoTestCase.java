package unq.tp3.rectanguloTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.punto.Punto;
import ar.edu.unq.po2.tp3.rectangulo.Cuadrado;

class CuadradoTestCase {

	private Cuadrado cuadrado;

	@BeforeEach
	private void setUp() throws Exception {
		Punto punto = new Punto(8,8);
		this.cuadrado = new Cuadrado(punto, 3);
	}
	
	@Test
	void testConstructor() {
		assertTrue(cuadrado.getEsquinaSuperiorIzquierda().isEqualTo(new Punto(8,8)));
		assertTrue(cuadrado.getEsquinaInferiorIzquierda().isEqualTo(new Punto(8,5)));
		assertTrue(cuadrado.getEsquinaInferiorDerecha().isEqualTo(new Punto(11,5)));
		assertTrue(cuadrado.getEsquinaSuperiorDerecha().isEqualTo(new Punto(11,8)));
	}
	
	@Test
	void testArea() {
		assertEquals(9, cuadrado.area());
	}
	
	@Test
	void testPerimetro() {
		assertEquals(12, cuadrado.perimetro());
	}
}
