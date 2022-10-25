package quizArraysMetodos;

import javax.swing.JOptionPane;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		int n2;
        int menu=0;
        do {
		menu=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:\n"
				+"1. Ver el número mayor\n"
				+"2. Ver el número menor\n"
				+"3. Calcular la raíz cuadrada\n"
				+"4. Elevar una potencia\n"
				+"5. Salir"));
		switch (menu){
		
		case 1:
			n1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
			n2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
			mayor(n1,n2);
			break;
		case 2:
			n1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
			n2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
			menor(n1,n2);
			break;
		case 3:
			n1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
			raizCuadrada(n1);
			break;
		case 4:
			n1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));
			n2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente"));
			potencia(n1, n2);
			break;
		}
        }while(menu!=5);
	}
	public static void mayor(int n1, int n2) {
		if(n1<n2) {
			System.out.println("El número mayor es: "+ n2);
		}else if(n2<n1) {
			System.out.println("El núemro mayor es: "+ n1);
		}else {
			System.out.println("Los números son iguales");
		}
	}
	public static void menor(int n1, int n2) {
		if(n1<n2) {
			System.out.println("El número menor es: "+ n1);
		}else if(n2<n1) {
			System.out.println("El número menor es: "+ n2);
		}else {
			System.out.println("Los números son iguales");
		}
	}
	public static double raizCuadrada(int n1) {
      double raiz=0;
      raiz= Math.sqrt(n1);
      System.out.println("La raíz cuadrada es: "+ raiz);
      return raiz;
		
	}
	public static int potencia(int n1, int n2) {
		int potencia=0;
		potencia= (int) Math.pow(n1, n2);
		System.out.println(n1+" elevado a la "+ n2+ " es igual a "+ potencia);
		return potencia;
	}

}
