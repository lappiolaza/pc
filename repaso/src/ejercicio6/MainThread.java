package ejercicio6;
//EjerCICIO 7/
public class MainThread {
	public static void main(String[] args) {
		Cliente cliente1=new Cliente("Cliente1",new int[] {2,2,1,5,2,3});
		Cliente cliente2=new Cliente("Cliente2",new int[] {1,3,5,1,1});
		long initialTime=System.currentTimeMillis();
		CajeroThread cajero1= new CajeroThread("Cajero1",cliente1,initialTime);
		CajeroThread cajero2= new CajeroThread("Cajero2",cliente2,initialTime);
		//tiempo inicial de referencia
		
		cajero1.start();
		cajero2.start();
		
		System.out.println("TERMINO EL CAJERO THREAAAAD");
	}
}
