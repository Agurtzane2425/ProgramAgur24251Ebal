package ebal1_2UNITATEA;

import java.util.Scanner;

public class Faktoriala_2_32 {

	public static void main(String[] args) {
			int zenbakia;
			int faktoriala = 1;
		
			Scanner teklatua = new Scanner(System.in);
			
			System.out.print("Idatzi zenbaki bat: ");
			zenbakia = teklatua.nextInt();
			
			teklatua.close();
			
			for (int i = 1; i <= zenbakia; i++) {
				faktoriala = faktoriala * i;
			}
			System.out.print("Faktoriala: " + faktoriala) ;
	}

}
