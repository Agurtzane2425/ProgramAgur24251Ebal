package ebal1_2UNITATEA;

import java.util.Scanner;

public class Aurkeztuznbkdw {
//2.23 Ariketa
	public static void main(String[] args) {
		int zenbakia;
		
		System.out.print("Idatzi zenbaki bat: ");
		Scanner teklatua = new Scanner(System.in);
		zenbakia = teklatua.nextInt();
		
		teklatua.close();
		
		while (zenbakia > 1){
			System.out.println(--zenbakia);
		}
	}

}
