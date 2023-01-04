package tehtävä;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Opintopisteet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Anna lukukausien määrä: ");
		int kaudet = sc.nextInt();
		double tulos = 0;
		
		for (int i = 1; i < kaudet+1 ; i++) {
			System.out.print("Anna " + i + ". lukukauden opintopisteesi: ");
			int pisteet = sc.nextInt();
			tulos = pisteet + tulos;
		}
		
		System.out.println("Sinulla pitäisi olla tähän mennessä " + (df.format(kaudet * 30) + " opintopistettä."));
		System.out.println("Sinulla on " + (df.format(tulos) + " opintopistettä."));
		
		if (kaudet * 30 < tulos) {
			System.out.println("Olet edellä tavoitteesta.");
		} else {
			System.out.println("Olet jäljessä tavoitteesta.");
		}
		
		System.out.println("Tutkinnosta puuttuu vielä " + (df.format(210 - tulos) + " opintopistettä."));
		
	}

}
