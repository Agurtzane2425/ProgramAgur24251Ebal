package ebal1;

import java.util.Scanner;

public class batuznbkw {

	public static void main(String[] args) {
		System.out.println("Sartu zenbaki oso bat Ehunera arte dauden zenbakiak haien artean gehitzeko:");
		Scanner scanner = new Scanner(System.in);
		int zenbakia = scanner.nextInt();
		int suma = 0;
		int i = 0; 
		while(i <= zenbakia) {
			suma += i;
			i++;		
		}
    System.out.println("Zenbakien batura: " + suma);

		scanner.close();
	}

}
