package ebal1_2UNITATEA;

import java.util.Scanner;

public class Aurkeztuznbk {
//2.21 Ariketa
	public static void main(String[] args) {
		int zenbakia;
		int hasiera = 1;
		
		System.out.print("Idatzi zenbaki bat: ");
		Scanner teklatua = new Scanner(System.in);
		zenbakia = teklatua.nextInt();
		
		teklatua.close();
		
		while (zenbakia > hasiera){
			System.out.println(hasiera++);
		}
	}

}
