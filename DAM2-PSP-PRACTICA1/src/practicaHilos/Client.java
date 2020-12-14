package practicaHilos;

import java.util.Random;

public class Client extends Thread{
	
	
	
	
	
	 private Cartera cartera;

	    public Client(Cartera cartera) { 
	        this.cartera = cartera;
		}
	
	
	@Override
	public void run() {
		
	
		
		  while (true) { 

	            try {
	            	Random r = new Random();
	            	int valorDado = r.nextInt(100)+1;
	                Thread.sleep(1000);
	                cartera.Aumentar(valorDado); 
	            } catch (InterruptedException e) {
	                
	                e.printStackTrace();
	            }

	        }
		
		
		
		
	}
}
	
	
	
