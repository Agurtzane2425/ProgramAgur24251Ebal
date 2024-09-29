package ebal1_2UNITATEA;

import java.util.Scanner;

public class Aurkeztubikbw {
//2.24 Ariketa
	public static void main(String[] args) {
		int zenbakia;
		int zero = 0;
		
		System.out.print("Idatzi zenbaki bat: ");
		Scanner teklatua = new Scanner(System.in);
		zenbakia = teklatua.nextInt();

		teklatua.close();
		
		while (zenbakia >= zero) {
			System.out.println(zenbakia);
			 zenbakia = zenbakia - 2;
		}
	}

}
