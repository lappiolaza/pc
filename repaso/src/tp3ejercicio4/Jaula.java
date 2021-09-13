package tp3ejercicio4;

public class Jaula {
			
	public synchronized void Ejercitarse(){
		try {
            Thread.sleep(10);
      } catch (InterruptedException e) {
    	System.out.println("Hilo interrumpido");
      }
	}
	public synchronized void Comer(){
		try {
            Thread.sleep(5);

      } catch (InterruptedException e) {
    	  System.out.println("Hilo interrumpido");
      }
	}
	public synchronized void Dormir(){
		try {
            Thread.sleep(100);

      } catch (InterruptedException e) {
    	  System.out.println("Hilo interrumpido");
      }
	}
}