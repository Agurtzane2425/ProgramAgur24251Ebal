package ebal1_1UNITATEA;

import java.util.Scanner;
//1.29 Ariketa
public class Kapitala {

	public static void main(String[] args) {
		double interesa, diruKantitatea, interesTasa;
		int denbora;
	
		System.out.print("Idatzi zein dan diru kantitatea: ");
		Scanner teklatua = new Scanner(System.in);
		diruKantitatea = teklatua.nextDouble();

		System.out.print("Idatzi zein dan denbora: ");
		denbora = teklatua.nextInt();
		
		System.out.print("Idatzi zein dan interes-tasa: ");
		interesTasa = teklatua.nextDouble();
		
		interesa = (diruKantitatea * interesTasa * denbora)/(360*100);
		
		System.out.print("Interesa " + interesa + "%-koa da");
		teklatua.close();
	}

}
