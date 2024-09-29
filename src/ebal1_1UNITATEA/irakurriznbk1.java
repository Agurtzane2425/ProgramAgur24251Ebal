package ebal1_1UNITATEA;

import java.util.Scanner;
//1.23 Ariketa
public class irakurriznbk1 {

	public static void main(String[] args) {
		int a;
		System.out.print("Idatzi enbaki oso bat: ");
		Scanner teklatua = new Scanner(System.in);
		a = teklatua.nextInt();
		System.out.print("\n" + ++a);
		teklatua.close();
	}

}
