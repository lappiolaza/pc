package tp3ejercicio5;

public class Main {

	public static void main(String[] args) {
		Imprimir imp=new Imprimir();		
		Letra letA=new Letra("A",imp);
		Letra letB=new Letra("B",imp);
		Letra letC=new Letra("C",imp);
		
		Thread hiloA=new Thread(letA);
		Thread hiloB=new Thread(letB);
		Thread hiloC=new Thread(letC);
		hiloA.start();
		hiloB.start();
		hiloC.start();
	}

}
