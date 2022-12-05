package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	static int maximo (int numero1, int numero2) {
		int maximo = numero1;
		
		if(numero2 > numero1) {
			maximo = numero2;
		}
		
		return maximo;
	}

	public static void main(String[] args) {
		int numero1, numero2, max;
		
		Scanner lectura = new Scanner(System.in);
		System.out.println("Introduzca un número:");
		numero1 = lectura.nextInt();
		
		System.out.println("Introduzca otro número:");
		numero2 = lectura.nextInt();
		
		max = maximo(numero1, numero2);
		System.out.println("El máximo es " + max);
		lectura.close();
	}
}
