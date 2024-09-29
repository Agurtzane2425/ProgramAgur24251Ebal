package ebal1_2UNITATEA;

import java.util.Scanner;
//2.6 Ariketa
public class Soldataret {

	public static void main(String[] args) {
		double soldata, atxikipen10, atxikipen12, atxikipen14;
		atxikipen10 = 0.1;
		atxikipen12 = 0.12;
		atxikipen14 = 0.14;
		
		System.out.print("Idatzi zure soldata: ");
		Scanner teklatua = new Scanner(System.in);
		soldata = teklatua.nextDouble();
		teklatua.close();
		
		if (soldata < 1000 ) {
			System.out.print(soldata + " euroko soldata %10-eko atxikipena dauka, beraz soldata " + 
		    (soldata - (atxikipen10 * soldata)) + " eurokoa da") ;
		}
		else if (soldata == 1000) {
			System.out.print(soldata + " euroko soldata %12-ko atxikipena dauka, beraz soldata " + 
			(soldata - ( atxikipen12 * soldata)) + " eurokoa da");
		}
		 else {
			System.out.print(soldata + " euroko soldata %14-ko atxikipena dauka, beraz soldata " + 
		(soldata - (atxikipen14 * soldata)) + " eurokoa da");
		}
}
}