package ejercicio6;

public class Cliente {
	private String nombre;
	private int[] carroCompra;
	public Cliente(String str, int[] carr) {
		nombre=str;
		carroCompra=carr;
	}
	public String getNombre() {
		return this.nombre;
	}
	public int[] getCarroCompra() {
		return this.carroCompra;
	}
		
	public static void main(String[] args) {
		Cliente cliente1=new Cliente("Cliente1",new int[] {2,2,1,5,2,3});
		Cliente cliente2=new Cliente("Cliente2",new int[] {1,3,5,1,1});
		Cajero cajero1=new Cajero("Cajero1");
		//tiempo inicial de referencia
		long initialTime=System.currentTimeMillis();
		cajero1.procesarCompra(cliente1, initialTime);
		cajero1.procesarCompra(cliente2, initialTime);
		
	}

}
