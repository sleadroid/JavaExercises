package tehtävä;

import java.util.Scanner;

public class Lahjavero {
	//double laskeVero(double arvo) <--- Lisäsin tämän koska ohjelma sanoi ettei sitä muka löytynyt?
	static double laskeVero(double arvo, double b, double c, double d) {
		return (((arvo - b) / 100) * c) + d;
	  }

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double arvo = 0;
		double alin = 0;
		double veroP = 0;
		double alaraja = 0;
		
		System.out.print("Anna lahjan suuruus: ");
		arvo = sc.nextDouble();
		
		if (arvo >= 5_000 && arvo < 25_000) {
			alin = 5_000;
			alaraja = 100;
			veroP = 8;
		}
		if (arvo >= 25_000 && arvo < 55_000) {
			alin = 25_000;
			alaraja = 1_700;
			veroP = 10;
		}
		if (arvo >= 55_000 && arvo < 200_000) {
			alin = 55_000;
			alaraja = 4_700;
			veroP = 12;
		}
		if (arvo >= 200_000 && arvo < 1_000_000) {
			alin = 200_000;
			alaraja = 22_100;
			veroP = 15;
		}
		if (arvo >= 1_000_000) {
			alin = 1_000_000;
			alaraja = 142_100;
			veroP = 17;
		}
		
		double tulos = laskeVero(arvo,alin,veroP,alaraja);
		
		System.out.println("Lahjavero on " + String.format("%.2f",tulos) + " euroa");

	}

}
