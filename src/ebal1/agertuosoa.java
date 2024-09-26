package ebal1;

import java.util.Scanner;

public class agertuosoa {

	public static void main(String[] args) {
		System.out.println("Sartu zenbaki oso bat: ");
		int numero;
		Scanner scanner;
		scanner = new Scanner(System.in);
		numero = scanner.nextInt();
		System.out.println("Balioa " + numero);
		scanner.close();
	}

}
