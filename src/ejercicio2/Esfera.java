package ejercicio2;

public class Esfera {
	static double radio;
	
	static double area() {
		double area=0;
		area = 4*Math.PI*Math.pow(radio,2);
		return area;		
	}
	
	static double volumen() {
		double vol = 0;
		vol = 4*Math.PI*Math.pow(radio,3)/3;
		return vol;
	}
}
