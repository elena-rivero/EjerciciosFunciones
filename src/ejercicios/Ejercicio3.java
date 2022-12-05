package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	static void cilindro(int opcion, double radio, double altura) {
		double area, volumen;
		switch(opcion) {
		case 1:
			area = 2*Math.PI*radio*(altura + radio);
			System.out.println("El área del cilindro es: " + area);
			break;
		case 2:
			volumen = Math.PI*Math.pow(radio, 2)*altura;
			System.out.println("El volumen del cilindro es: " + volumen);
			break;
		default: System.out.println("Opción errónea");
		}
	}

	public static void main(String[] args) {
		int opcion;
		double radio, altura;
		
		Scanner lectura = new Scanner(System.in);
		System.out.println("Introduzca una opción:");
		opcion = lectura.nextInt();
		
		System.out.println("Introduzca la altura:");
		altura = lectura.nextDouble();
		
		System.out.println("Introduzca el radio:");
		radio = lectura.nextDouble();
		
		cilindro(opcion, radio, altura);
		lectura.close();
	}
}
