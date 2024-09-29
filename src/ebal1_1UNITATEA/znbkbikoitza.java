package ebal1_1UNITATEA;

import java.util.Scanner;
//1.24 Ariketa
public class znbkbikoitza {

	public static void main(String[] args) {
		int a;
		System.out.print("Idatzi zenbaki oso bat: ");
		Scanner teklatua = new Scanner(System.in);
		a = teklatua.nextInt();
		System.out.print("\n" + 2*a);
		teklatua.close();
	}

}
