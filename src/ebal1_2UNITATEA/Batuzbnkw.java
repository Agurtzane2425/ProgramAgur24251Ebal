package ebal1_2UNITATEA;

import java.util.Scanner;

public class Batuzbnkw {
//2.25 Ariketa
	public static void main(String[] args) {
		int zenbakia;
		int gehiketa = 0;
		
		System.out.print("Idatzi zenbaki bat: ");
		
		Scanner teklatua = new Scanner(System.in);
		zenbakia = teklatua.nextInt();
		teklatua.close();
		
		while (zenbakia >= 0) {
			//System.out.println(gehiketa); esto se puede dejar si queremos ver todas las sumas, lo quitamos si queremos solo la suma final
			gehiketa = gehiketa + zenbakia;
			zenbakia --;
		}
		System.out.print(gehiketa);
	}

}
