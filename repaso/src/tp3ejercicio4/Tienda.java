package tp3ejercicio4;

public class Tienda {

	public static void main(String[] args) {
		Jaula jau=new Jaula();
		Hamster hamsters=new Hamster("1",jau);
		Hamster hamsters2=new Hamster("2",jau);
		Hamster hamsters3=new Hamster("3",jau);
		Hamster hamsters4=new Hamster("4",jau);
//		hamsters[0]=new Hamster("1",jau);
//		hamsters[1]=new Hamster("2",jau);
//		hamsters[2]=new Hamster("3",jau);
		
		Thread ham=new Thread(hamsters);
		Thread ham2=new Thread(hamsters2);
		Thread ham3=new Thread(hamsters3);
		Thread ham4=new Thread(hamsters4);
		ham.start();
		ham2.start();
		ham3.start();
		ham4.start();
	}

}
