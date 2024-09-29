package ebal1_1UNITATEA;

import java.util.Scanner;
//1.12 Ariketa
public class Agertuosoa {

	public static void main(String[] args) {
		int a;
		System.out.print("Idatzi zenbaki hamartar bat: " );
		Scanner teklatua = new Scanner(System.in);
		a= teklatua.nextInt();
		System.out.println("n aldagaiaren balioa: "+ a + " da:");
		teklatua.close();
	}

}
