package ebal1;

import java.util.Scanner;

public class kuboa {

	public static void main(String[] args) {
	System.out.println("Sartu radioa bat: ");
	Scanner scanner = new Scanner(System.in);
	double numero = scanner.nextDouble();
	double PI = 3.1416;
	double azalera = 2 * numero * PI;
	System.out.printf("Perimetroa %.3f da", azalera);
	scanner.close();
	}

}
