package ejercicio6;

public class CajeroThread extends Thread {
	private String nombre;
	private Cliente cliente;
	private long initialTime;
	//Constructor y metodos	de acceso
	
	public CajeroThread(String str,Cliente cli,long ini) {
		nombre=str;
		cliente=cli;
		initialTime=ini;
	}
	public int esperarXsegundos(int esp) {
		System.out.println("tiempo de espera "+ esp);
		return esp;
	}
	public void run() {
		int suma=0;
		System.out.println("El cajero "+this.nombre + " COMIENZA a procesar al cliente "+this.cliente.getNombre() + " En el tiempo  "+ (System.currentTimeMillis()- this.initialTime) / 1000 + " Seg");
		for(int i=0; i < this.cliente.getCarroCompra().length;i++) {
			//this.esperarXsegundos(cliente.getCarroCompra()[i]);
			//System.out.print(this.esperarXsegundos(cliente.getCarroCompra()[i]));
			System.out.println("Procesando el producto "+(i+1)+"Del Cliente "+this.cliente.getNombre() +" --->Tiempo: "+ this.esperarXsegundos(cliente.getCarroCompra()[i]) +"seg");
			suma=suma+this.cliente.getCarroCompra()[i];
		}
		System.out.println("El cajero  "+this.nombre + " A TERMINADO de procesar al cliente "+this.cliente.getNombre() + " En el tiempo " + suma + " Seg");
	}
	

}
