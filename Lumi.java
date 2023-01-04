package tehtävä;

import java.util.Scanner;

public class Lumi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int lumi = 0;
		int summa = 0;
		String input = "";
		
		while(true){
            System.out.print( "Anna nimi: " );
            input = sc.next();
            summa = summa + 1;
            
            if (input.equalsIgnoreCase("lumi")) {
            	lumi = lumi + 1;
            }
            
			if (input.equalsIgnoreCase("loppu")) {
				summa = summa - 1;
				System.out.println("Nimiä oli " + summa + " kappaletta.");
				System.out.println("Nimi Lumi esiintyi " + lumi + " kertaa.");
				break;
			}
			

		}

	}

}
