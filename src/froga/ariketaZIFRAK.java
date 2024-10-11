package froga;

import java.util.Scanner;

public class ariketaZIFRAK {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Sartu zenbaki bat: ");
		        int zenbakia = scanner.nextInt();
		        scanner.close();
		        
		        while (zenbakia > 0) {
		            int zifra = zenbakia % 10;  
		            System.out.println(zifra);  
		            zenbakia = zenbakia / 10;   
		        }
		    }
		}
