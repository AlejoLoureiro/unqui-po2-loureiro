package ar.edu.unq.po2.tpTest.pokerStatus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest1 {
	
	private PokerStatus status;
	private String P2;
	private String C2;
	private String D2;
	private String T2;
	private String P10;
	private String C10;
	private String D10;
	private String T10;
	

	@BeforeEach
	void setUp() throws Exception {
		// Esta parte es el setUp del test
		status = new PokerStatus();
		P2 = "2P";
		C2 = "2C";
		D2 = "2D";
		T2 = "2T";
		P10 = "10P";
		C10 = "10C";
		D10 = "10D";
		T10 = "10T";
	}

	@Test
	void testSinPoquer() {
		// En esta parte el assertFalse es el verify y el status.verificar es el exercise
		assertFalse(status.verificar(P2, C2, D2, P10, C10));
	}
	
	@Test
	void testConPoquerDeUnDigito() {
		// En esta parte el assertTrue es el verify y el status.verificar es el exercise
		assertTrue(status.verificar(P2, C2, D2, T2, C10));
	}

	@Test
	void testConPoquerDeDieces() {
		// En esta parte el assertTrue es el verify y el status.verificar es el exercise
		assertTrue(status.verificar(P10, C10, D10, T10, P2));
	}
}
