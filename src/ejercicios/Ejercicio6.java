package ejercicios;

public class Ejercicio6 {

	public static void main(String[] args) {
		
	}

	public static boolean esPrimo(int numero) {
		boolean esPrimo = true;
		for(int i=2; i<numero; i++) {
			if(numero%i == 0) {
				esPrimo = false;
				break;
			}
		}
		return esPrimo;
	}
}
