package ebal1_2UNITATEA;
import java.util.Scanner;
//2.13 Ariketa
public class Bisurtea1B {

	   public static void main(String[] args) {
	        int urtea;
	        
	        System.out.print("Idatzi urtea: ");
		    Scanner teklatua = new Scanner(System.in);
	        urtea = teklatua.nextInt();
	        teklatua.close();
	        
	        if (urtea % 4 == 0 && urtea % 100 != 0 || urtea % 400 == 0) {
	                System.out.println(urtea + " urte bisurtea da");
	        }
	        else {
	            System.out.println(urtea + " ez da urte bisurtea");
	        }
	}
}
