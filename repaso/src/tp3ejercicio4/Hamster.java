package tp3ejercicio4;

public class Hamster implements Runnable{
	String nombre;
	Jaula jaula;
	//String elementos[]={"comer","ejercitarse","dormir"};
	public Hamster( String nom,Jaula jau ) {
		this.nombre=nom;
		this.jaula=jau;
	}
		public String getNombre(){
			return this.nombre;
		}
		public void run(){
			this.jaula.Comer();
			System.out.println(this.getNombre()+"Esta haciendo comiendo");
			this.jaula.Ejercitarse();
			System.out.println(this.getNombre()+"Esta haciendo ejercicio");
			this.jaula.Dormir();
			System.out.println(this.getNombre()+"Esta durmiendo");
		}
	}
