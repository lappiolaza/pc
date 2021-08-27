package repaso;

public class Dos {
	private static int metodo(){
		int valor=0;
		try {
			valor=valor +1;
			valor=valor +1 + Integer.parseInt("W");
			valor=valor +1;
			System.out.println("Valor final del try: "+ valor);
		}catch (NumberFormatException e) {
			valor=valor +1 + Integer.parseInt("42");
			System.out.println("Valor final del catch: "+ valor);
		}finally {
			valor=valor+1;
			System.out.println("Valor final del finaly: "+ valor);
		}
		valor=valor +1;
		System.out.println("Valor antes del return: "+ valor);
		return valor;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(metodo());
		}catch (Exception e) {
			System.err.println("excetion en metodo");
			e.printStackTrace();
		}

	}

}
