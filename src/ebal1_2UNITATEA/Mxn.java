package ebal1_2UNITATEA;

import java.util.Scanner;

public class Mxn {
//2.4 Ariketa
	public static void main(String[] args) {
		double a, a2;
		
		System.out.print("Idatzi zenbaki bat: ");
		Scanner teklatua = new Scanner(System.in);
		a = teklatua.nextDouble();
		teklatua.close();
		a2 = Math.pow(a, 2);
		if (a2 >= 100) {
			System.out.print(a2-100);
		}
		else {
			System.out.print(100-a2);
		}
	}

}
