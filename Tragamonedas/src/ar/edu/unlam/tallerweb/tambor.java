package ar.edu.unlam.tallerweb;

import java.util.concurrent.ThreadLocalRandom;

public class tambor {
   
	 private int valor;
 
	 public void girar() {
			this.valor = ThreadLocalRandom.current().nextInt(-1,8);
		}
	 
	public int obtenerValor() {
		return valor;
		
	}
	

	
}
