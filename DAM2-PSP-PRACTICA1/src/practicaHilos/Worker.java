package practicaHilos;

import java.util.Random;

public class Worker extends Thread{
	
	
	

	 private Cartera cartera;

	    public Worker(Cartera cartera) { 
	        this.cartera = cartera;
		}
	
	@Override
	public void run() {	
			
		  while (true) { 

	            try {
	            	Random r = new Random();
	            	int valorDado = r.nextInt(100)+1;
	                Thread.sleep(1000);
	                cartera.Drecementar(valorDado); 
	            } catch (InterruptedException e) {
	                
	                e.printStackTrace();
	            }

	        }
		
		
		
		
	}
	


}
