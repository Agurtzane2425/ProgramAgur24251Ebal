package ebal1_1UNITATEA;

import java.util.Scanner;
//1.28 Ariketa
public class Kuboa {

	public static void main(String[] args) {
		int a;
		System.out.print("Idatzi zenbaki bat: ");
		Scanner teklatua = new Scanner(System.in);
		a = teklatua.nextInt();
		System.out.print("Zenbaki horren kuboa " + a * a * a + " da");
		teklatua.close();
	}

}

//double a,kuboa;

//System.out.print("Idatzi zenbaki bat: ");
//Scanner teklatua = new Scanner(System.in);
//a = teklatua.nextInt();
//kuboa = Math.pow(a,3);
//System.out.print(kuboa);
//teklatua.close();