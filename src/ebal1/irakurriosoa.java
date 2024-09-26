package ebal1;

import java.util.Scanner;

public class irakurriosoa {

	public static void main(String[] args) {
		System.out.println("Sartu zenbaki oso bat: ");
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		System.out.printf("Aldagaiaren balioa %d da", numero);
		scanner.close();
	}

}
