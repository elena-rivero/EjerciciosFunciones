package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	// Precondición: numero1 <= numero2
	static void imprimeRango(int numero1, int numero2) {
		for(int i = numero1; i<= numero2; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		int numero1, numero2;
		Scanner lectura = new Scanner(System.in);
		System.out.println("Introduzca un número:");
		numero1 = lectura.nextInt();
		
		System.out.println("Introduzca un número:");
		numero2 = lectura.nextInt();
		
		if(numero1<=numero2) {
			imprimeRango(numero1, numero2);
		} else {
			imprimeRango(numero2, numero1);
		}
		lectura.close();
	}
}
