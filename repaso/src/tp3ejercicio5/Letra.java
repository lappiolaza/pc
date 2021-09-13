package tp3ejercicio5;

public class Letra implements Runnable{
	String nombre;
	Imprimir imp;
	public Letra(final String nom,Imprimir im){
		this.nombre=nom;
		this.imp=im;
	}
	
	public void run() {
		if (getNombre()=="A")
		 for(int i=0;i<1;i++) 
			imp.escribir(getNombre());
		if (getNombre()=="B")
		 for(int i=0;i<2;i++) 
			imp.escribir(getNombre());
		if (getNombre()=="C")
		 for(int i=0;i<3;i++) 
			imp.escribir(getNombre());
	}
	public String getNombre() {
		return this.nombre;
	}
}
