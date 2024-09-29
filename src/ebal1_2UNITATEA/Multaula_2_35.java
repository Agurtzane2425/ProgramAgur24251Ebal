package ebal1_2UNITATEA;

import java.util.Scanner;

public class Multaula_2_35 {
//2.35 Ariketa
	public static void main(String[] args) {
		int zenbakia;
		
		Scanner teklatua = new Scanner(System.in);
		
		System.out.print("Idatzi zenbaki bat: ");
		zenbakia = teklatua.nextInt();
		
		teklatua.close();
		
		for (int i = zenbakia; i <= zenbakia; i++) {
			System.out.println("\nTabla del "  + i);
		for (int j = 1; j <= 10; j++)
		    System.out.println(i + "*" + j + "="  + (i*j)) ;
	}
	}
}
