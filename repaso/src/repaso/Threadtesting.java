package repaso;
//ejercicio 2
class Threadtesting{
		public static void main (String[] args ) {
			Thread miHilo= new MiEjecucion();
			miHilo.start();
			System.out.println(Thread.currentThread());
			//if (miHilo == Thread.currentThread()) { 
			//control
			  for (int i=0;i<10;i++) {
				  System.out.println("main");
			  }
			//}
			
	}
}
