package ar.edu.unlam.tallerweb;

import static org.junit.Assert.*;

import org.junit.Test;

public class tragamonedaTest {
	
	@Test
	public void ObtenerResultadoTest() {
		
		tragamoneda t = new tragamoneda();
				
		boolean resultado = t.Gane();
		
		assertEquals(resultado,true);
		
				
		
	
	}

}
