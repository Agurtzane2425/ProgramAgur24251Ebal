package ebal1_2UNITATEA;

import java.util.Scanner;

public class BatuznbkDowhile {
	//2.27 Ariketa
	public static void main(String[] args) {
		int zenbakia;
		int gehiketa = 0;
		
		System.out.print("Idatzi zenbaki bat: ");
		
		Scanner teklatua = new Scanner(System.in);
		zenbakia = teklatua.nextInt();
		
		
		while (zenbakia < 0) {
			System.out.println("Zenbaki hori ez da positiboa");
			System.out.print("Idatzi zenbaki bat: ");
			zenbakia = teklatua.nextInt();
		}
		
		teklatua.close();
		
		do {
			//System.out.println(gehiketa);
			gehiketa = gehiketa + zenbakia;
			zenbakia --;
		} while (zenbakia >= 0);
			System.out.println(gehiketa);
	}

}
