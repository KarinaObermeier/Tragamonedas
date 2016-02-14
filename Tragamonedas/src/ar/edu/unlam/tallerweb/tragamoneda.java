package ar.edu.unlam.tallerweb;

public class tragamoneda{

private tambor tambor1,tambor2,tambor3;

	public tragamoneda(){
	  tambor1 = new tambor();
	  tambor2 = new tambor();
	  tambor3 = new tambor();
	}

    public void Girar(){
	 
    	tambor1.girar();
       	tambor2.girar();
      	tambor3.girar();
    	
        }
    
    public boolean Gane(){
    	if(tambor1.obtenerValor()== tambor2.obtenerValor() && 
    			tambor2.obtenerValor()== tambor3.obtenerValor())
    	{
    		System.out.print(tambor1.obtenerValor());
    		System.out.print(tambor2.obtenerValor());
    		System.out.print(tambor3.obtenerValor());
    	    return true;
    	}
		return false;
    }
}
