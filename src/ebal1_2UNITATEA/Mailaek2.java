package ebal1_2UNITATEA;
import java.util.Scanner;
public class Mailaek2 {
// 1.14 Ariketa
	public static void main(String[] args) {
		double a, b, c, x1, x, x2, bkarratu, xzatia;
		
		Scanner teklatua = new Scanner(System.in);
		
		System.out.print("Sartu a: ");
		a = teklatua.nextDouble();
		
		System.out.print("Sartu b: ");
		b = teklatua.nextDouble();
		
		System.out.print("Sartu c: ");
		c = teklatua.nextDouble();
		
		teklatua.close();
		
		bkarratu = Math.pow(b, 2);
		
		xzatia = bkarratu - (4 * a * c);
		
		if (xzatia>0) {
			x1 = (-b + Math.sqrt(xzatia))/(2*a);
			x2 = (-b - Math.sqrt(xzatia))/(2*a);
			System.out.println("x1= " + x1 + " eta x2= " + x2);
		}
		else if (xzatia == 0) {
			x = -b / (2 * a);
            System.out.println("Soluzio bakarra, x = " + x);
        } else {
        	System.out.println("Erro konplexuak");
		}
	}

}
