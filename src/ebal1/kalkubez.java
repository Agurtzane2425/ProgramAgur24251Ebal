package ebal1;

import java.util.Scanner;

public class kalkubez {

	public static void main(String[] args) {
		System.out.println("Sartu diru zenbakia: ");
		Scanner scanner = new Scanner(System.in);
		float dinero = scanner.nextFloat();
		if (dinero > 20000) {
			System.out.printf("BEZa %%16 narekin gehituta dirua %.4f izango da", dinero + (dinero * 0.16));
		}
		else {
			System.out.printf("BEZ %%7 narekin gehituta dira %.4f izango da", dinero + (dinero * 0.07));			
		}
		scanner.close();

	}

}
