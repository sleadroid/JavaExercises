package tehtävä;

import java.util.Scanner;

public class Kellonaika {
	
	static Scanner sc = new Scanner (System.in);
	
	static String kysyKellonaika(String aika) {
		System.out.print("Anna kellonaika muodossa tt:mm: ");
		aika = sc.next();

		return aika;
		
	}
	
	static boolean tarkastaKellonaika(String kellonaika) {
		
		kellonaika = kysyKellonaika(null);
		
		if(kellonaika != null) {
			
		}
		return false;
		
	}

	public static void main(String[] args) {
		
		tarkastaKellonaika(null);
		
		System.out.println();

	}

}
