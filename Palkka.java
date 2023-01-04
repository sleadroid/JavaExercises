package tehtävä;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Palkka {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Anna palkka: ");
		double palkka = sc.nextDouble();
		
		System.out.print("Anna veroprosentti: ");
		double verop = sc.nextDouble();
		
		System.out.print("Anna ikä: ");
		int ika = sc.nextInt();
		double elakep = 0;
		
		if (ika >= 53 && ika <= 62) {
			elakep = 0.0825;
		} 
		
		if (ika < 53) {
			elakep = 0.0675;
		}
		
		double veroOsuus = (palkka * verop / 100);
		DecimalFormat df = new DecimalFormat("0.#");
		double elakemaksu = (palkka * elakep);
		double tyottomyys = (palkka * 0.015);
		
		System.out.println("Bruttopalkka " + (df.format(palkka)));
		System.out.println("Veron osuus " + String.format("%.2f",veroOsuus));
		System.out.println("Tyäeläkevakuutusmaksun osuus " + String.format("%.2f", elakemaksu));
		System.out.println("Työttömyysvakuutuksen osuus " + String.format("%.2f", tyottomyys));
		System.out.println("Käteen jää " + String.format("%.2f", (palkka - veroOsuus - elakemaksu - tyottomyys)));
		
	}

}
