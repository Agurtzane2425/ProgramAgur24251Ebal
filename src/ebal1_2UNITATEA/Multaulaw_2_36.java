package ebal1_2UNITATEA;

import java.util.Scanner;

public class Multaulaw_2_36 {

	public static void main(String[] args) {
		int zenbakia;
		
		Scanner teklatua = new Scanner(System.in);
		
		do {
		
			System.out.print("Idatzi zenbaki bat: ");
			zenbakia = teklatua.nextInt();
			
			if (zenbakia != 0) {
			for (int i = zenbakia; i <= zenbakia; i++) {
			System.out.println("\nTabla del "  + i);
			for (int j = 1; j <= 10; j++)
		    System.out.println(i + "*" + j + "="  + (i*j)) ;
				}
			}
			
		} while (zenbakia != 0);		
		
			System.out.print("Amaitu");
			teklatua.close();
	}
	
}
