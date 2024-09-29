package ebal1_2UNITATEA;

import java.util.Scanner;

public class TxikiagoHandiago {
//2.5
	public static void main(String[] args) {
		int a,b;
		
		System.out.print("Idatzi zenbaki bat: ");
		Scanner teklatua = new Scanner(System.in);
		a = teklatua.nextInt();
		
		System.out.print("Idatzi bigarren zenbaki bat: ");
		b = teklatua.nextInt();
		teklatua.close();
		
		if (a > b) {
			System.out.print(a + " handiagoa da " + b + " baino");
		}
		else if ( a == b) {
			System.out.print(b + " eta " + a + " berdinak dira");
		}
		else {
			System.out.print(b + " handiagoa da " + a + " baino");
		}
	}

}
