package teht‰v‰;

import java.util.Scanner;

public class Kulutus {
	
	static Scanner sc = new Scanner (System.in);
	
	static int kysyKilometrit(int metKm) {
		System.out.print("Anna ajetut kilometrit: ");
		metKm = sc.nextInt();
		return metKm;
	}
	
	static double kysyTankkaus(double metTank) {
		System.out.print("Anna tankattu m‰‰r‰: ");
		metTank = sc.nextDouble();
		return metTank;
	}
	
	static double laskeKulutus(int kilometrit, double tankattu) {
		kilometrit = kysyKilometrit(0);
		tankattu = kysyTankkaus(0);
		return (tankattu / kilometrit) * 100;
	}
	
	static void naytaKulutus(double kulutus) {
		System.out.print("Kulutus/100km on " + String.format("%.2f",laskeKulutus(0, 0)) + " litraa");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		naytaKulutus(0);

	}

}
