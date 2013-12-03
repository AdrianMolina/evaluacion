package evaluacion;

import static org.junit.Assert.*;

import org.junit.Test;

public class bisiestoTest {

	@Test
	public void retornarAnio() {
		Bisiesto b = new Bisiesto();
		assertEquals("1995", b.esBisiesto(1995));
	}

}
