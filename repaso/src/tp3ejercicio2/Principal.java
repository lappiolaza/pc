package tp3ejercicio2;

public class Principal {

	
	public static void main(String[] args) {
	
	Personaje pe=new Personaje();
	Curandero cur= new Curandero(pe);
	Orco orc= new Orco(pe);
	
	Thread tcur=new Thread(cur);
	Thread torc=new Thread(orc);
	System.out.println("EMPIEZA LA PELEA");
	tcur.start();
	torc.start();
	try {
		tcur.join();
		torc.join();
	}catch (InterruptedException exc){
		System.out.println("Hilo principal interrumpido.");
	}
	
	System.out.println("TERMINO vida final "+orc.personaje.Obtener());
	
	}

}
