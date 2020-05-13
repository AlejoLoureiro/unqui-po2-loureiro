package unq.tp5.personaYMascotaTestCase;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.personaYMascota.Mascota;
import ar.edu.unq.po2.tp5.personaYMascota.Persona;
import ar.edu.unq.po2.tp5.personaYMascota.SerVivoConNombre;

class PersonaYMascotaTestCase {
	
	private Persona alejo;
	private Persona pablo;
	private Mascota firulais;
	private Mascota barto;
	private List<SerVivoConNombre> lista;
	
	@BeforeEach
	void setUp() throws Exception {
		this.alejo = new Persona("Alejo", new Date(100, 1, 29));
		this.pablo = new Persona("Pablo", new Date(98, 1, 29));
		this.firulais = new Mascota("Firulais", "Golden");
		this.barto = new Mascota("Barto", "Labrador");
		this.lista = new ArrayList<SerVivoConNombre>();
		lista.add(alejo);
		lista.add(pablo);
		lista.add(firulais);
		lista.add(barto);
	}

	@Test
	void testPersonaMascota() {
		List<String> result = new ArrayList<String>();
		for (SerVivoConNombre serVivo: lista) {
			result.add(serVivo.getNombre());
		}
		assertEquals(4, result.size());
		assertEquals("Alejo", result.get(0));
		assertEquals("Firulais", result.get(2));
	}

}
