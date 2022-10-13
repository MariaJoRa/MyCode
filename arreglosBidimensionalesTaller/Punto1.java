package arreglosBidimensionalesTaller;

public class Punto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arrayInt = new int[11][11];
		
		for(int i=1;i<arrayInt.length;i++) {
			for(int j=1; j<arrayInt.length;j++) {
		      int multiplicacion= i*j;
		      System.out.print(multiplicacion+"  ");
			}
			System.out.println();
		}
	}

}
