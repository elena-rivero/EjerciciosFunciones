package sobrecarga;

import java.util.Scanner;

public class Ejemplos {
	public static int suma(int a, int b) {
		return a+b;
	}
	
	public static double suma(double a, double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		int numInt1, numInt2;
		double numDouble1, numDouble2;
		int resInt;
		double resDouble;
		
		Scanner sc = new Scanner(System.in);
		numInt1=sc.nextInt();
		numInt2=sc.nextInt();
		numDouble1=sc.nextDouble();
		numDouble2=sc.nextDouble();
		
		resInt = suma(numInt1, numInt2);
		resDouble = suma(numDouble1, numDouble2);
		
		sc.close();
	}
}
