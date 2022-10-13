package arreglosBidimensionalesTaller;

import java.util.Arrays;

public class Punto3 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String[][] matriz= {{"a11","a12","a13"},
			           {"a21","a22","a23"}};
	
	for(int i=0;i<matriz.length;i++) {
		for(int j=0;j<matriz.length;j++) {
			System.out.print(matriz[j][i]+" ");
		}
		System.out.println();
	}
	System.out.println("a13 "+"a23");
	}
		
	}

