package ejercicio6;

public class MainRunnable {

	public static void main(String[] args) {
		Cliente cliente1=new Cliente("Cliente1",new int[] {2,2,1,5,2,3});
		Cliente cliente2=new Cliente("Cliente2",new int[] {1,3,5,1,1});
		long initialTime=System.currentTimeMillis();
		CajeroRunnable cajero1= new CajeroRunnable("Cajero1",cliente1,initialTime);
		CajeroRunnable cajero2= new CajeroRunnable("Cajero2",cliente2,initialTime);
		//tiempo inicial de referencia
		Thread caj1= new Thread(cajero1);
		Thread caj2= new Thread(cajero2);
		caj1.start();
		caj2.start();
		System.out.println("TERMINO EL CAJERO RUNNEABLE");
	}
}
