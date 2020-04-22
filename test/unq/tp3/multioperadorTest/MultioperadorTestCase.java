package unq.tp3.multioperadorTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.multioperador.Multioperador;

class MultioperadorTestCase {

	ArrayList<Integer> xs;
	Multioperador multOp;
	
	@BeforeEach
	private void setUp() throws Exception {
		multOp = new Multioperador();
		xs = new ArrayList<Integer>();
		xs.add(1);
		xs.add(4);
		xs.add(5);
		xs.add(3);
		xs.add(8);
		xs.add(5);
		xs.add(8);
		xs.add(9);
	}
	
	@Test
	void testSumArray() {
		int x = multOp.sumArray(xs);
		assertEquals(43, x);
	}

	@Test
	void testSubtArray() {
		int x = multOp.subtArray(xs);
		assertEquals(-43, x);
	}
	
	@Test
	void testMultArray() {
		int x = multOp.multArray(xs);
		assertEquals(172800, x);
	}
}
