package ebal1;

import java.util.Scanner;

public class Zirkuluazalera {

	public static void main(String[] args) {
	System.out.println("Sartu zenbaki bat: ");
	Scanner scanner = new Scanner(System.in);
	int numero = scanner.nextInt();
	int kubo = numero * numero;
	System.out.printf("Zenbakiaren kuboa %d da", kubo);
	scanner.close();
	}

}
