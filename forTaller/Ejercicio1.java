package forTaller;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int suma = 0;
		String n = JOptionPane.showInputDialog("Ingrese la cantidad total de datos:");
		int nInt = Integer.parseInt(n);
	
		for(int x=0; x!=nInt; x++) {
			String num = JOptionPane.showInputDialog("Ingrese un número:");
			int numInt = Integer.parseInt(num);
			suma= suma+numInt;
		}
		double promedio= suma/nInt;
		JOptionPane.showMessageDialog(null, "El promedio es: "+promedio);
	}

}
