package ebal1;

import java.util.Scanner;

public class agertukarakterea {

	public static void main(String[] args) {
		System.out.println("Sartu karaktere bat: ");
		Scanner scanner = new Scanner(System.in);
		char caracter = scanner.next().charAt(0);
		System.out.print("Balioa: " + caracter);
		scanner.close();
	}

}
