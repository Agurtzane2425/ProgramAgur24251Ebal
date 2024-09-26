package ebal1;

import java.util.Scanner;

public class irakurrihamartarra {

	public static void main(String[] args) {
		System.out.println("Sartu hamartar zenbaki bat: ");
		Scanner scanner = new Scanner(System.in);
		float numero = scanner.nextFloat();
		System.out.printf("Aldagaiaren balioa %.2f da", numero);
		scanner.close();
	}

}
