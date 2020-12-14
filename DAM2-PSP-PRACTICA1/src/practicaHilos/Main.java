package practicaHilos;


public class Main {
	public static void main(String[] args){
		
	
	
	
		for(int x=0;x<100;x++) {
			Hilos2 unHilo = new Hilos2();
			
			unHilo.start();
			try {
				unHilo.join();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		} 
		
		
		Cartera unaCartera= new Cartera(0);
		
		
		  Client unCliente = new Client(unaCartera);
	        for (int y = 0; y < 10; y++) {
	        	 unCliente = new Client(unaCartera);
	        	unCliente.start();
	            
	        }

	      Worker unTrabajador = new Worker(unaCartera);
	        for (int y = 0; y < 10; y++) {
	        	unTrabajador = new Worker(unaCartera);
	        	unTrabajador.start();
	            
	        }
	}
}

