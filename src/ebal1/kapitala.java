package ebal1;

import java.util.Scanner;

public class kapitala {

	public static void main(String[] args) {
		System.out.println("Zenbat diru sartuko duzu?: ");
		Scanner scanner = new Scanner(System.in);
		float dirua = scanner.nextFloat();
		System.out.println("Zenbat % 1interes-tasa sartuko duzu?: ");
		float tasa = scanner.nextFloat();
		tasa = tasa * 100;
		System.out.println("Zenbat deboran sartuko duzu?: ");
	  float denbora = scanner.nextFloat();
		scanner.close();
		float kapitala = (dirua * tasa * denbora)/(360*100);
		System.out.printf("Kapitala %f da.", kapitala);
	}

}
