package tehtävä;
import java.util.Scanner;

public class Peltipoliisi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Anna nopeutesi: ");
		int nopeus = sc.nextInt();
		
		if (nopeus > 80 && nopeus <= 100 ) {
			System.out.println("Rikesakko");
		}
		if (nopeus > 100 ) {
			System.out.println("Päiväsakko");
			
			System.out.println("Anna nettokuukausitulosi: ");
			double netto = sc.nextDouble();
			
			double sakko = (netto - 255) / 60;
			
			if (sakko > 6) {
			System.out.println("Päiväsakon määrä on " + String.format("%.2f", sakko) + " euroa");
			} 
			
			if (sakko <= 6) {
				System.out.println("Päiväsakon määrä on 6,00 euroa");
			}
			
		}

	}

}
