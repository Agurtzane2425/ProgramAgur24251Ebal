package ebal1;

import java.util.Scanner;

public class balioabs {

	public static void main(String[] args) {
	System.out.println("Sartu zenbakia: ");
	Scanner scanner = new Scanner(System.in);
	float valorteclado = scanner.nextFloat();
	float balioabs;
	if (valorteclado >= 0) {
		balioabs = valorteclado;
		}
		else{
		balioabs = - valorteclado;
		}
	System.out.printf("Balio absolutua: %f", balioabs);
	scanner.close();

	}

}
