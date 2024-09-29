package ebal1_2UNITATEA;

import java.util.Scanner;
public class Kalkubez {
//2.3 Ariketa
	public static void main(String[] args) {
		double oinarria, beza1, beza2;
		beza1 = 1.16; //jartzen badugu 0,16 eta 0,07 Beza kantitatea atarako da eta gero oinarria gehitu egin behar genuke 
		beza2 = 1.07;
		
		System.out.print("Idatzi kantitate bat: ");
		Scanner teklatua = new Scanner(System.in);
		oinarria = teklatua.nextDouble();
		teklatua.close();
		
		if (oinarria > 200000) {
			System.out.println("Bez-a %16-koa izango da beraz " + beza1 * oinarria +  " da");
		}
		else {
			System.out.println("Bez-a %7-koa izango da beraz " + beza2 * oinarria + " da");
		}
			
	}

}
