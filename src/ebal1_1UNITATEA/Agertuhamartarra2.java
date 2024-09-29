package ebal1_1UNITATEA;

import java.util.Scanner;
//1.16 Ariketa
public class Agertuhamartarra2 {

	public static void main(String[] args) {
		double a;
		
		System.out.print("Idatzi zenbaki hamartar bat: " );
		Scanner teklatua = new Scanner(System.in);
		a = teklatua.nextDouble();
		System.out.print("Zure hamartar zenbakia hurrengoa da: " + a + " da");
		teklatua.close();

	}

}
