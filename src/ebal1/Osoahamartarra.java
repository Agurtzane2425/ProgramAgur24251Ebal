package ebal1;

import java.util.Scanner;

public class Osoahamartarra {

	public static void main(String[] args) {
	System.out.println("Sartu zenbaki hamartar bat: ");
	Scanner scanner = new Scanner(System.in);
	float numeroentero = scanner.nextFloat();
	int numero = (int) numeroentero;
	float numerodecimal = numeroentero - numero;
	System.out.printf("Zenbaki osoa %d da", numero);
	System.out.printf("Zenbaki parte hamartarra %f da",numerodecimal);
	scanner.close();
	}

}
