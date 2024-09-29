package ebal1_2UNITATEA;
import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		int n;
		System.out.print("n = ");
		Scanner teklatua = new Scanner(System.in);
		n = teklatua.nextInt();
	       int nkal = n % 2;
	       System.out.print("hau da: " + nkal);
	    teklatua.close();
	}

}
