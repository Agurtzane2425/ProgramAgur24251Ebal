package ebal1;

import java.util.Scanner;

public class agertuhamartarra2 {

	public static void main(String[] args) {
		System.out.print("Sartu Hamartar zenbaki bat Github: ");
		Scanner scanner = new Scanner(System.in);
		double numero = scanner.nextDouble();
		System.out.printf("zenbakia %.2f", numero);
		scanner.close();
	}

}
