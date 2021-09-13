package tp3ejercicio2;

public class Curandero implements Runnable{
	Personaje personaje;
	
	Curandero(Personaje per){
		this.personaje=per;
	}
		
	public void run() {
		personaje.Curar();
	}

}