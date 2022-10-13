package arreglosBidimensionalesTaller;

public class Punto4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean mayorDeEdad;
		int[] edades= {17,22,23,15,28,16,20};
		
		for(int i=0; i<edades.length; i++) {
			if(edades[i]<18) {
				mayorDeEdad=false;
			}else {
				mayorDeEdad=true;
			}
			if(mayorDeEdad==false) {
				System.out.println("Menor de edad "+ edades[i]);
			}if(mayorDeEdad==true) {
				System.out.println("Mayor de edad "+ edades[i]);
			}
		}
	}
}

