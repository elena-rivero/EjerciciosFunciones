package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	static void eco(int numero) {
		for (int i = 1; i <= numero; i++) {
			System.out.println("Eco...");
		}
	}

	public static void main(String[] args) {
		int numero;
		Scanner lectura = new Scanner(System.in);
		System.out.println("Introduzca un número:");
		numero = lectura.nextInt();
		eco(numero);
		lectura.close();
	}
}
