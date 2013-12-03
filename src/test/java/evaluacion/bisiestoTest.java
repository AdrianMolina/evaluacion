package evaluacion;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class bisiestoTest {
	
	private Bisiesto b;
	
	@Before
	public void setUp(){
		b = new Bisiesto();
	}

	@Test
	public void retornarAnio() {
		assertEquals("1995", b.esBisiesto(1995));
	}
	
	@Test
	public void anioDivisibleEntreCuatro() {
		assertEquals("es divisible", b.esBisiesto(1996));
	}

}
