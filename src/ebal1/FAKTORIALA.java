package ebal1;
import java.util.Scanner;
public class FAKTORIALA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, m, e=1;
		System.out.println("Sartu zenbaki osoa");
		Scanner teklatua = new Scanner(System.in);
		n = teklatua.nextInt();
		teklatua.close();
		m=n;
		while (n>0) {
			e=e*n;
			n--;
		}
		System.out.println(""+m+"-(r)en faktoriala "+e+" da");

	}

}
