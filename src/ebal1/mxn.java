package ebal1;

import java.util.Scanner;

public class mxn {

	public static void main(String[] args) {
		System.out.println("Sartu zenbaki bat: ");
		Scanner scanner = new Scanner(System.in);
		float numero = scanner.nextFloat();
		if (Math.pow(numero,2) > 100) {
			System.out.printf("Kentzen dut 100 beraz: %.2f ", Math.pow(numero,2) - 100);
		}
		else {
			System.out.printf("100 nera heltzeko %.2f falta dira", 100 - Math.pow(numero,2));
		}
		scanner.close();

	}

}
