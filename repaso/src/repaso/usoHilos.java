package repaso;
//Ejercicio 5 a y d
class usoHilos {
	
	public static void main(String[] args) {
	System.out.println("Hilo principal iniciando");
												//primero construye uno objeto hilo
	MiHilo mh=new MiHilo("#1");
	MiHilo mh2=new MiHilo("#2");
	MiHilo mh3=new MiHilo("#3");
												//luego construyo un hilo de ese objeto
	Thread nuevoHilo= new Thread(mh);
	Thread nuevoHilo2= new Thread(mh2);
	Thread nuevoHilo3= new Thread(mh3);
												//finalmente comienza la ejecucion del hilo
	nuevoHilo.start();
	nuevoHilo2.start();
	nuevoHilo3.start();
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
