package teht�v�;

import java.util.Scanner;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class HenkiloMapSovellus {
	public static void main(String[] args) {
		Map<String, Koko> Koko = new HashMap<String, Koko>();
		Map<String, Henkilo> Henkilo = new HashMap<String, Henkilo>();	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("1. Lis�� henkil�");
		System.out.println("2. N�yt� henkil�n tiedot");
		System.out.println("3. Muuta henkil�n nimi ja osoite");
		System.out.println("4. Muuta henkil�n koko");
		System.out.println("5. N�yt� kaikki henkil�t");
		System.out.println("0. Lopetus");
		
		int repeat = 1;
		do {
				System.out.print("Anna valintasi (0-5): ");
				String valinta = sc.next();
				
				if (valinta.equalsIgnoreCase("1")) {
					
					Henkilo nimi = new Henkilo();
					System.out.print("Anna nimi: ");
					nimi.setNimi(sc.next());
					
					Henkilo osoite = new Henkilo();
					System.out.print("Anna osoite: ");
					osoite.setOsoite(sc.next());
				}
				if (valinta.equalsIgnoreCase("2")) {
					System.out.print("Anna n�ytett�v�n henkil�n nimi: ");
					String haku = sc.next();
					if(Henkilo.containsKey(haku)){
						System.out.println(Henkilo.get(haku));
					} else {
						System.out.println("Henkil�� ei ole");
					}
				}
				if (valinta.equalsIgnoreCase("3")) {
					
				}
				if (valinta.equalsIgnoreCase("4")) {
					
				}
				if (valinta.equalsIgnoreCase("5")) {
					Set<String> nimet= Henkilo.keySet();
					Iterator<String> i = nimet.iterator();
					while (i.hasNext()) { 
						System.out.println(Henkilo.get(i.next()));
					}
					
				}
				if (valinta.equalsIgnoreCase("0")) {
					System.exit(0);
				}
		}while(repeat == 1);
				
	}

}
