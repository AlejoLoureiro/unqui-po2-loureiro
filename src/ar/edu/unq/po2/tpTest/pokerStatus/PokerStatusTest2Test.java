package ar.edu.unq.po2.tpTest.pokerStatus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest2Test {

	private PokerStatus2 status;
	private String P2;
	private String C2;
	private String D2;
	private String T2;
	private String P10;
	private String C10;
	private String D10;
	private String T10;
	private String P4;
	private String P5;
	private String P6;
	

	@BeforeEach
	void setUp() throws Exception {
		// Esta parte es el setUp del test
		status = new PokerStatus2();
		P2 = "2P";
		C2 = "2C";
		D2 = "2D";
		T2 = "2T";
		P10 = "10P";
		C10 = "10C";
		D10 = "10D";
		T10 = "10T";
		P4 = "4P";
		P5 = "5P";
		P6 = "6P";
	}

	@Test
	void testSinNada() {
		// En esta parte el assertFalse es el verify y el status.verificar es el exercise
		assertFalse(status.verificar(P2, C2, P6, P10, C10) == null);
	}
	
	@Test
	void testConPoquerDeUnDigito() {
		// En esta parte el assertTrue es el verify y el status.verificar es el exercise
		assertTrue(status.verificar(P2, C2, D2, T2, C10) == "Poquer");
	}

	@Test
	void testConPoquerDeDieces() {
		// En esta parte el assertTrue es el verify y el status.verificar es el exercise
		assertTrue(status.verificar(P10, C10, D10, T10, P2) == "Poquer");
	}
	
	@Test
	void testColor() {
		// En esta parte el assertTrue es el verify y el status.verificar es el exercise
		assertTrue(status.verificar(P10, P4, P5, P6, P2) == "Color");
	}
	
	@Test
	void testTrioDeUnDigito() {
		// En esta parte el assertTrue es el verify y el status.verificar es el exercise
		assertTrue(status.verificar(P2, C2, D2, P4, C10) == "Trio");
	}
	
	@Test
	void testTrioDeDieces() {
		// En esta parte el assertTrue es el verify y el status.verificar es el exercise
		assertTrue(status.verificar(P10, T10, D2, P4, C10) == "Trio");
	}
	
}