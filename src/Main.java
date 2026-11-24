import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Choose Mode:");
		System.out.println("1 = SSS");
		System.out.println("2 = SAS");
		System.out.println("3 = ASA");
		System.out.println("4 = Right Triangle");
		int mode = input.nextInt();
		
		if (mode == 1) {
			System.out.println("Enter side a: ");
			double a = input.nextDouble();
			System.out.println("Enter side b: ");
			double b = input.nextDouble();
			System.out.println("Enter side c: ");
			double c = input.nextDouble();
			
			double A = TrigCalculations.CosLawAngle(a, b, c);
			System.out.println(A);
			double B = TrigCalculations.CosLawAngle(a, b, c);
			System.out.println(B);
			double C = 180 - A - B;
			
			System.out.println("Angle A = " + A);
			System.out.println("Angle B = " + B);
			System.out.println("Angle C = " + C);
			
			
			
			
		}
	}
	
}
