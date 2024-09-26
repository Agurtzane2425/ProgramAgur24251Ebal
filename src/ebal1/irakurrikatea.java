package ebal1;

import java.util.Scanner;

public class irakurrikatea {

	public static void main(String[] args) {
		System.out.println("Sartu kate bat: ");
		Scanner scanner = new Scanner(System.in);
		String cadena = scanner.nextLine();
		System.out.printf("Aldagaiaren balioa %s da", cadena);
		scanner.close();
	}

}
