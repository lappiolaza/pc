package repaso;
//Ejercicio 5 C
public class usoHilos2 {

	public static void main(String[] args) {
		System.out.println("Hilo principal iniciando");
		//luego construyo un hilo de ese objeto Mihilo2
		MiHilo2 mh=new MiHilo2("#1");
		 										
		//finalmente comienza la ejecucion del hilo
		mh.start();
			for(int i=0;i<10;i++){
				System.out.println(".");
			} try {
				Thread.sleep(10000);
			}catch(InterruptedException exc) {
				System.out.println("Hilo Principal interrumpido");
			}
			System.out.println("Hilo Principal Finalizado");
		}
}
