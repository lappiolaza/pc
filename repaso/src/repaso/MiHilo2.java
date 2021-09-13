package repaso;
//Ejercicio 5 C
public class MiHilo2 extends Thread{
	public MiHilo2(String str) {
		super(str);
	}
	
	public void run() {
		System.out.println("Comenzando"+ getName());
		try {
			for(int contar=0;contar<10;contar++) {
				Thread.sleep(400);
				System.out.println("En"+getName()+"El recuento"+contar);
			} 
		}catch(InterruptedException exc){
				System.out.println(getName()+"hilo interrumpido");
			}
			System.out.println("En"+getName()+"TErminado");
		}
}
