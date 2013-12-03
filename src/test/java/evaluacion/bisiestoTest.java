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
	public void retornarAnio(){
		assertEquals("1995", b.mostrarAnio(1995));
	}
	
	@Test
	public void anioDivisibleEntreCuatro(){
		assertEquals("es bisiesto", b.esBisiesto(1996));
	}
	
	@Test
	public void anioDivisibleEntreCuatroyCien(){
		assertEquals("no es bisiesto", b.esBisiesto(1900));
	}
	
	@Test
	public void anioDivisibleCuatrocientosyCien(){
		assertEquals("es bisiesto", b.esBisiesto(2000));
	}

}
