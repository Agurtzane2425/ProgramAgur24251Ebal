package ebal1;

import java.util.Scanner;

public class irakurrikarakterea {

	public static void main(String[] args) {
		System.out.println("Sartu karaktere bat: ");
		Scanner scanner = new Scanner(System.in);
		char caracter = scanner.next().charAt(0);
		System.out.printf("Aldagaiaren balioa %c da", caracter);
		scanner.close();
	}
}
