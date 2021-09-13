package tp3ejercicio2;

public class Personaje {
	private int vida=10;
	
	public int Obtener(){
		return this.vida;
	}
	//public synchronized void Guardar(int vi){ this.vida=vi;}
    public synchronized void Curar() {
    	this.vida=this.Obtener()+3;
    	System.out.println("SE CUROOOOOO Vida Actual  "+this.Obtener());
	}
    public synchronized void Golpear() {
    	this.vida=this.Obtener()-3;
    	System.out.println("LE PEGOOOOOOOO Vida Actual "+this.Obtener());
	}
}