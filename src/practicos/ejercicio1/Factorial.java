package practicos.ejercicio1;

public class Factorial {

	public static long factorial(int numero) {
		long result;
		
		if(numero==0) {
			result=1;
		} else {
			result = numero * factorial(numero-1);
		}
		
		return result;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println(factorial(5));

	}

}
