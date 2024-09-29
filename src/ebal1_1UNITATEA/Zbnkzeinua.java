package ebal1_1UNITATEA;
import java.util.Scanner;
//Ariketa 1.25
public class Zbnkzeinua {

	public static void main(String[] args) {
		int a;
		System.out.print("Idatzi zenbaki oso bat: " );
		Scanner teklatua = new Scanner(System.in);
		a = teklatua.nextInt();
		System.out.println("Zure zenbakia " + -a + " da");
		teklatua.close();
	}

}
