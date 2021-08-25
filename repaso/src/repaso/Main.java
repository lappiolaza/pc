package repaso;

public class Main {
	
	public interface Barco{
		String matricula="a";
		int slora=0;
		String afabricacion="a";
		
	}
	public class Alquiler{
		int n_amarre, monto;
		String f_inicio, f_fin;
		Barco bar;
		Cliente cli;
	}
	public class Cliente{
		String dni, nombre,f_nac;
		
	}
	public class Velero implements Barco{
		int cant_mast;
	}
	public class Motor implements Barco{
		int potencia;
	}
	public  class Yate implements Barco{
		int potencia,can_camarotes;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.printf("Hola mundo 2");
	}

}
