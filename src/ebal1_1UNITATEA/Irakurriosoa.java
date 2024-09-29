package ebal1_1UNITATEA;

import java.util.Scanner;
//1.17 Ariketa
public class Irakurriosoa {

	public static void main(String[] args) {
		int a;
		
		System.out.print("Idatzi zenbaki oso bat: ");
		Scanner teklatua = new Scanner (System.in);
		a= teklatua.nextInt();
		System.out.print("Aldagaiaren balioa " + a + " da");
		teklatua.close();
	}

}

//beste modua printf-rekin
//int a;
//System.out.print("Idatzi zenbaki oso bat: ");
//Scanner teklatua = new Scanner (System.in);
//a= teklatua.nextInt();
//System.out.printf("Aldagaiaren balioa %d da", a);
//teklatua.close();