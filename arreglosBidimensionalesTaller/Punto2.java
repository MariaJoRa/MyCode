package arreglosBidimensionalesTaller;

import javax.swing.JOptionPane;

public class Punto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int min=1;
		int max=9;
		int opcion=0;
		int sumaColumnas=0;
		int sumaFilas=0;
		int restaColumnas=0;
		int restaFilas=0;
		int valorAleatorio1=0;
		int valorAleatorio2=0;
		int multiplicacionFilas=1;
		int multiplicacionColumnas=1;
		
		
		int[][] arrayInt=new int[5][5];
		
		for(int i=0;i<arrayInt.length;i++) {
	    	for(int j=0; j<arrayInt.length;j++) {
	    	valorAleatorio1= (int)Math.floor(Math.random()*(max-min+1))+min;
	    	System.out.print(valorAleatorio1+" ");
	    	sumaColumnas=sumaColumnas+valorAleatorio1;
	    	restaColumnas=restaColumnas-valorAleatorio1;
	    	multiplicacionColumnas=multiplicacionColumnas*valorAleatorio1;
	    	}
	    	valorAleatorio2= (int)Math.floor(Math.random()*(max-min+1))+min;
	    	System.out.println(valorAleatorio2);
	    	sumaFilas=sumaFilas+valorAleatorio2;
	    	restaFilas=restaFilas-valorAleatorio2;
	    	multiplicacionFilas=multiplicacionFilas*valorAleatorio2;
           
	    }
		
	    	
           
	    
	    
		do {
		String menu= JOptionPane.showInputDialog("Elija la operación deseada:\n"
	       +"1. Suma\n"
		   +"2. Resta\n"
	       +"3. Multiplicación\n"
		   +"4. Salir");
		opcion= Integer.parseInt(menu);
		
		switch(opcion) {
		case 1:
			System.out.println("Suma filas: "+sumaFilas);
			System.out.println("Suma columnas: "+sumaColumnas);
		break;
		
		case 2:
			System.out.println("Resta filas: "+restaFilas);
			System.out.println("Resta columnas: "+restaColumnas);
			break;
			
		case 3:	
			System.out.println("Multiplicación filas: "+multiplicacionFilas);
			System.out.println("Multiplicación columnas: "+multiplicacionColumnas);
			break;
			

	}
}while(opcion!=4); 

	}}

