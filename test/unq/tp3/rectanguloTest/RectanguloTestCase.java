package unq.tp3.rectanguloTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.punto.Punto;
import ar.edu.unq.po2.tp3.rectangulo.Rectangulo;

class RectanguloTestCase {
	
	private Rectangulo rectangulo;

	@BeforeEach
	private void setUp() throws Exception {
		Punto punto = new Punto(8,8);
		this.rectangulo = new Rectangulo(punto, 3, 5);
	}
	
	@Test
	void testConstructor() {
		assertTrue(rectangulo.getEsquinaSuperiorIzquierda().isEqualTo(new Punto(8,8)));
		assertTrue(rectangulo.getEsquinaInferiorIzquierda().isEqualTo(new Punto(8,3)));
		assertTrue(rectangulo.getEsquinaInferiorDerecha().isEqualTo(new Punto(11,3)));
		assertTrue(rectangulo.getEsquinaSuperiorDerecha().isEqualTo(new Punto(11,8)));
	}
	
	@Test
	void testArea() {
		assertEquals(15, rectangulo.area());
	}
	
	@Test
	void testPerimetro() {
		assertEquals(16, rectangulo.perimetro());
	}
	
	void testOrientacion() {
		assertEquals("Vertical", rectangulo.orientacion());
	}

}
