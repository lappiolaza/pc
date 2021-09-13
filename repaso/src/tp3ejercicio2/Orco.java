package tp3ejercicio2;

public class Orco implements Runnable{
	Personaje personaje;
	
	Orco(Personaje per){
		this.personaje=per;
	}
	public void run() {
		personaje.Golpear();
	}

	
}
