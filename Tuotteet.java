package tehtävä;

import java.util.Scanner;

public class Tuotteet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int numero;
		String nimi;
		double hinta;
		String kuvaus;
		
		System.out.print("Annan tuotenumero: ");
		numero = sc.nextInt();
		
		System.out.print( "Anna tuotteen nimi: " );
        nimi = sc.next();
        
        System.out.print("Anna tuotteen hinta: ");
		hinta = sc.nextDouble();
		
		System.out.print( "Anna tuotteen kuvaus: " );
        kuvaus = sc.next();
        
        System.out.println("Numero: " + numero);
        System.out.println("Nimi: " + nimi.trim().toUpperCase());
        System.out.println("Hinta: " + String.format("%.2f",hinta));
        
        if (!kuvaus.equalsIgnoreCase("")) {
        	System.out.println("Kuvaus: " + kuvaus.trim().substring(0, 1).toUpperCase() + kuvaus.substring(1));
        }

	}

}
