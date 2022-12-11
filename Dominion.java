package teht‰v‰;

import java.util.Scanner;

public class Dominion {
	
	static int laskePisteet(int a, int b, int c, int d) {
		return (a * -1) + (b * 2) + (c * 5) + (d * 8);
	  }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int kirous = 0;
		int tila = 0;
		int pitaja = 0;
		int laani = 0;
		
		System.out.print("Anna kirouskorttien m‰‰r‰: ");
		kirous = sc.nextInt();
		
		System.out.print("Anna tilakorttien m‰‰r‰: ");
		tila = sc.nextInt();
		
		System.out.print("Anna pit‰j‰korttien m‰‰r‰: ");
		pitaja = sc.nextInt();
		
		System.out.print("Anna l‰‰nikorttien m‰‰r‰: ");
		laani = sc.nextInt();
		
		int tulos = laskePisteet(kirous,tila,pitaja,laani);
		
		System.out.println("Pisteiden yhteism‰‰r‰ on " + tulos);
		
	}

}
