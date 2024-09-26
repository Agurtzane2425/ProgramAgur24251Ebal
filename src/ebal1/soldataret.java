package ebal1;

import java.util.Scanner;

public class soldataret {

	public static void main(String[] args) {
		System.out.println("Zure soldata sartu: ");
		Scanner scanner = new Scanner(System.in);
		double sueldo = scanner.nextDouble();
		float a = (float) 0.10;
		float b = (float) 0.12;
		float c = (float) 0.14;
		float neto;
		
		if (sueldo > 1000) {
			neto = (float) (sueldo - (sueldo * a));
		}
		else {
			if (sueldo == 1000) {
				neto = (float) (sueldo - (sueldo * b));
			}
			else {
				neto = (float) (sueldo - (sueldo * c));
			}
		
		scanner.close();
		}
		System.out.printf("Zure soldata hau da: %.2f", neto);

	}

}
