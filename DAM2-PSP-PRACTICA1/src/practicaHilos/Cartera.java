package practicaHilos;



public class Cartera  extends Thread{
	
    private int dinero;

    public Cartera(int dinero) {
        this.dinero = dinero;
    }

    synchronized void Aumentar(int cantidad){
        System.out.println("Se ha aumentado en:  " + cantidad + " en la cartera hay :  " + (dinero += cantidad));

    }

    synchronized void Drecementar(int cantidad){
        System.out.println("Se ha decrementado en:  " + cantidad + " en la cartera hay :  " + (dinero -= cantidad));
    }
}

    
	


