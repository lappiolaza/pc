package ejercicio6;

public class Cajero {
	private String nombre;
		//agregar constructoerslllllll
	public Cajero(String str) {
		nombre=str;
	}
	public void esperarXsegundos(int esp) {
		System.out.println("tiempo de espera "+ esp);
		for(int c=1;c<=esp;c++ ) {
			System.out.println("Esperando segundo....."+c);
		}
	}
	public void procesarCompra(Cliente cliente, long timeStamp) {
		int suma=0;
		System.out.println("El cajero "+this.nombre + " COMIENZA a procesar al cliente "+cliente.getNombre() + " En el tiempo  "+ (System.currentTimeMillis()-timeStamp) / 1000 + " Seg");
		for(int i=0; i < cliente.getCarroCompra().length;i++) {
			this.esperarXsegundos(cliente.getCarroCompra()[i]);
			//System.out.print(this.esperarXsegundos(cliente.getCarroCompra()[i]));
			System.out.println("Procesando el producto "+(i+1)+" --->Tiempo: "+ (System.currentTimeMillis()-timeStamp)/1000 +"seg");
			suma=suma+cliente.getCarroCompra()[i];
		}
		System.out.println("El cajero  "+this.nombre + " A TERMINADO de procesar al cliente "+cliente.getNombre() + " En el tiempo " + suma + " Seg");
	}
}
