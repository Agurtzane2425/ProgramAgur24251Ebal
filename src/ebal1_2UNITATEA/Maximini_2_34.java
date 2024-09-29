package ebal1_2UNITATEA;

import java.util.Scanner;

public class Maximini_2_34 {
//2.34 Ariketa
	public static void main(String[] args) {
		int zenbakia;
		int handiena = Integer.MIN_VALUE; 
        int txikiena = Integer.MAX_VALUE;
        
		Scanner teklatua = new Scanner(System.in);
		
		System.out.print("Idatzi zenbaki bat: ");
		zenbakia = teklatua.nextInt();
		
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
