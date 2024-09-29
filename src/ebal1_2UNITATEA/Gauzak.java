package ebal1_2UNITATEA;

import java.util.Scanner;
public class Gauzak {
//2.10 Ariketa
	public static void main(String[] args) {
		int kantitatea, kodea, deskonteTartea;
		double prezioFinalaDeskonteBarik, prezioFinalaDeskontearekin, deskontea, prezioa;
		
		Scanner teklatua = new Scanner(System.in);
		
		System.out.print("Idatzi artikuluaren kodea: ");
		kodea = teklatua.nextInt();
		
		System.out.print("Idatzi artikuluaren prezioa: ");
		prezioa = teklatua.nextInt();
		
		System.out.print("Idatzi artikuluren kantitatea: ");
		kantitatea = teklatua.nextInt();
		
		teklatua.close();
		
		
		if (kantitatea > 100) {
			deskonteTartea = 1;
		}
		else if (kantitatea > 25 && kantitatea <= 100) {
			deskonteTartea = 2;
		}
		else if (kantitatea > 10 && kantitatea<=25) {
			deskonteTartea = 3;
		}
		else {
			deskonteTartea = 4;
		}
		
		switch (deskonteTartea) {
			case 1:
				deskontea = 0.40;
				break;
			case 2:
				deskontea = 0.20;
				break;
			case 3:
				deskontea = 0.10;
				break;
			default:
				deskontea = 0.0;
				break;
		}
		
		prezioFinalaDeskonteBarik = prezioa * kantitatea;
		prezioFinalaDeskontearekin =  prezioFinalaDeskonteBarik - (prezioFinalaDeskonteBarik * deskontea);
				
		System.out.println("\nArtikuluaren kodea " + kodea + " da");
		System.out.println("Artikuluaren prezioa " + prezioa + "€-koa da");
		System.out.println("Artikulu kantitatea " + kantitatea + " da");
		System.out.println("Artikuluaren deskontea " + deskontea * 100 + "%-koa da");
		System.out.println("Artikuluen prezioa deskonte barik " + prezioFinalaDeskonteBarik + "€-koa da");
		System.out.println("Artikuluen prezioa deskontearekin " + prezioFinalaDeskontearekin + "€-koa da");
		System.out.println("Artikuluen deskonte totala " + (prezioFinalaDeskonteBarik - prezioFinalaDeskontearekin) + "€-koa da");
		
	}
}
