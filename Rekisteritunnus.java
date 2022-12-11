package tehtävä;

import java.util.Scanner;

public class Rekisteritunnus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String reknum;
		
		System.out.print("Anna rekisterinumero: ");
		reknum = sc.next();
		
		
		if (Character.isDigit(reknum.charAt(4)) || Character.isDigit(reknum.charAt(3))) {
			
			if (reknum.charAt(4) > '0' || reknum.charAt(3) > '0') {
				
				if (Character.isLetter(reknum.charAt(0)) && Character.isLetter(reknum.charAt(1)) && Character.isLetter(reknum.charAt(2)) && reknum.charAt(3) == '-'){
					
					System.out.print("Rekisterinumero on kelvollinen");

				}
				
				if (Character.isLetter(reknum.charAt(0)) && Character.isLetter(reknum.charAt(1)) && reknum.charAt(2) == '-'){
					
					System.out.print("Rekisterinumero on kelvollinen");

				}
			} else {
				System.out.print("Rekisterinumero ei ole kelvollinen");
			} 
			
		} else {
			System.out.print("Rekisterinumero ei ole kelvollinen");
		}

	}

}
