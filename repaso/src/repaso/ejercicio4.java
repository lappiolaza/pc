package repaso;

public class ejercicio4 {
	
	public static double acceso_por_indice (double [] v, int j) {
				try{
					if ((j>= 0) && (j <= v.length)){
					}	
				}catch (RuntimeException exc){
				System.out.println("El indice " + j + " no existe en el vector"+ exc);
				}
				return v[j];
	
	}		
	public static void main(String[] args) {
		double [] v = new double [22];
		acceso_por_indice (v,18);

	}

}