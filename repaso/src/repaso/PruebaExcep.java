package repaso;
public class PruebaExcep{

	public static void edad (int e) throws Exception  {		
		if (e<18){
			throw new Exception ("Mensaje Es menor......");
		}
		System.out.println("es mayor");
	}
	public static void  jugar (int e) throws Exception {
		if (e!=(int)(Math.random()*10+1)){
			throw new Exception ("perdioooooooooooooo");
		}
		System.out.println("GAnooooooooooooo");
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//edad(8);
		jugar(4);
	}

}
