package unq.tp3.counterTest;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Before;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import ar.edu.unq.po2.tp3.counter.Counter;

public class CounterTestCase {

	private Counter counter;
	
	@Before
	public void setUp() throws Exception{
		counter = new Counter(new ArrayList<Integer>());
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}
	
	@Test
	public void testEvenNumbers() {
		int x = this.counter.getEvenOcurrences();
		assertEquals(x, 1);
	}
	
	@Test
	public void testOddOcurrences() {
		int x = this.counter.getOddOcurrences();
		assertEquals(x, 9);
	}
	
	@Test
	public void testMultiplesCounter() {
		int x = this.counter.getMultipleOcurrences(3);
		assertEquals(x, 2);
	}
}
