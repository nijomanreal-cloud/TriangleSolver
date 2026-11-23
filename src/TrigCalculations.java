
public class TrigCalculations {

	public static double Pytha(double A, double B) {
		double C = Math.pow(A, 2)+Math.pow(B,2);
		C = Math.sqrt(C);
		return C;
	}
	
	public static double SineLawSide(double A, double B, double a) {
		// When using sin A, A must be in RADIANS
		A = Math.toRadians(A);
		B = Math.toRadians(B);
		double b = a * Math.sin(B)/Math.sin(A);
		return b;
	}
	
	public static double SineLawAngle(double A, double a, double b) {
		A = Math.toRadians(A);
		double B = b * Math.sin(A)/a;
		return B;
		
	}
	public static double CosLawAngle(double a, double b, double c) {
		double C =
		return C;	
	}
	public static double CosLawSide(double A, double b, double c) {
		
	}
}
