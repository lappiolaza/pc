package repaso;

public class ThreadEjemplo extends Thread{
	public ThreadEjemplo(String str) {
		super(str);
	}
	public void run(){
		for (int i = 0 ; i <10 ; i++) 
			System.out.println( i +" "+ getName());
	    System.out.println("Termina thread run" +getName());
	}
	
	public static void main(String[] args) {
		new ThreadEjemplo("La Maria").start();
		new ThreadEjemplo("Jose").start();
		System.out.println("Termina el thread ");
	}

}
