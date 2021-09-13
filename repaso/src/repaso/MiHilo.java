package repaso;
//Ejercicio 5 
public class MiHilo implements Runnable {
	String nombreHilo;
	 MiHilo(String nombre){
		nombreHilo=nombre;
	}
	
	public void run() {
		System.out.println("Comenzando"+nombreHilo);
		try {
			for(int contar=0;contar<10;contar++) {
				Thread.sleep(400);
				System.out.println("En"+nombreHilo+"El recuento"+contar);
			} 
		}catch(InterruptedException exc){
				System.out.println(nombreHilo+"hilo interrumpido");
			}
			System.out.println("En"+nombreHilo+"TErminado");
		}
}
	
