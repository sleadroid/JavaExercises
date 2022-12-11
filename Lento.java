package tehtävä;

import java.util.Scanner;

public class Lento {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String merkkijono;
		int numero;
		
		System.out.print("Anna lennon numero: ");
		merkkijono = sc.next();
		
		if (merkkijono.charAt(0) == 'A' && merkkijono.charAt(1) == 'Y'){
			
			if (merkkijono.charAt(2) == '1'){
				System.out.print("Kaukolento");
			}
			
			if (merkkijono.charAt(2) >= '2' && merkkijono.charAt(2) <= '6'){
				System.out.print("Kotimaan lento");
			}
			
			if (merkkijono.charAt(2) == '7'){
				System.out.print("VenÃ¤jÃ¤n lento");
			}
			
		} else {
			System.out.print("Ei ole Finnairin lento");
		}
	}

}
