package forTaller;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int suma = 0;
		String n1 = JOptionPane.showInputDialog("Ingrese el número menor: ");
		int minInt = Integer.parseInt(n1);
		
		String n2 = JOptionPane.showInputDialog("Ingrese el número mayor: ");
		int maxInt = Integer.parseInt(n2);
		
		for(int x = minInt;  x<=maxInt ; x++) {
			suma=suma+x;
		}
	    System.out.print("La suma entre "+minInt+" y "+maxInt+" es " +suma);
		
	}	
	}	
