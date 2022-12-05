package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int numero, numDivisores;
		Scanner sc = new Scanner(System.in);
		
		numero = sc.nextInt();
		numDivisores = numDivisoresPrimos(numero);
		
		System.out.println("Número de divisores: " + numDivisores);
		sc.close();
	}

	public static int numDivisoresPrimos(int numero) {
		int cont = 0;
		
		for(int i=2; i<=numero; i++) {
			if(numero%i==0 && esPrimo(i)) {
				cont++;
			}
		}
		
		return cont;
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
