package forTaller;



public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int suma=0;
		int contador=0;
		for(int x=2; x<101; x=x+2) {
			contador++;
			suma=suma+x;
		}System.out.println("La suma de los número pares del 1 al 100 es: "+ suma
				+"\nLa cantidad de número pares que hay entre 1 y 100 es: "+ contador);
	}

}
