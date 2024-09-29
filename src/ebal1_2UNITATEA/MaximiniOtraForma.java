package ebal1_2UNITATEA;

import java.util.Scanner;

public class MaximiniOtraForma {

	public static void main(String[] args) {
		int zenbakia;
		int handiena;
        int txikiena;
        
		Scanner teklatua = new Scanner(System.in);
		
		System.out.print("Idatzi zenbaki bat: ");
		zenbakia = teklatua.nextInt();
		handiena = zenbakia;
		txikiena = zenbakia;
		
		while (zenbakia > 0){
			if (zenbakia > handiena) {
				handiena = zenbakia;	
			}
			if (zenbakia < txikiena) {
				txikiena = zenbakia;
			}
			
			
			System.out.print("Idatzi zenbaki bat: ");
			zenbakia = teklatua.nextInt();
			
		}
		
		teklatua.close();
		
		System.out.println("Zenbaki handiena " + handiena + " izan da");
		System.out.println("Zenbaki txikiena " + txikiena + " izan da");

	}

}
