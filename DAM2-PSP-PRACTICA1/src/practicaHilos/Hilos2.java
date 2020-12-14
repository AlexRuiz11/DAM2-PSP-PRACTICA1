package practicaHilos;

import java.util.Random;

public class Hilos2 extends Thread{
	
	private int id;
    private static int numInstances;

    public Hilos2() {
    	
        id = ++numInstances;
    }	 



@Override
public void run() {
	
	Random r = new Random();
	int valorDado = r.nextInt(6)+1;
	
	System.out.println("Soy el hilo " +id + " y me pongo a dormir "  + valorDado + " segundos.");
	
	try {
		Thread.sleep(valorDado);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Soy el hilo " + id + " y he terminado de dormir ");
	

	
}
	

}

