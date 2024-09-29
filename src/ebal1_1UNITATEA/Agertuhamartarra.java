package ebal1_1UNITATEA;

import java.util.Scanner;
//1.13 Ariketa
public class Agertuhamartarra {

	public static void main(String[] args) {
		double a;
		
		System.out.print("Sartu zenbaki hamartar bat: " );
		Scanner teklatua = new Scanner (System.in);
		a = teklatua.nextDouble();
		System.out.println("Zenbakia " + a + " da");
		teklatua.close();
	}

}
