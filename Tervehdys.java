package teht�v�;
import java.util.Scanner;

public class Tervehdys {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Anna tunnit: ");
		
		int aika = sc.nextInt();
		
		if (aika >= 7 && aika <= 10) {
			System.out.println("Hyvää huomenta!");
		}
		
		if (aika >= 10 && aika <= 16) {
			System.out.println("Hyvää päivää!");
		}
		
		if (aika >= 17 && aika <= 21) {
			System.out.println("Hyvää iltaa!");
		}
		
		if (aika >= 22 && aika <= 24) {
			System.out.println("Hyvää yötä!");
		}
		
		if (aika >= 0 && aika <= 6) {
			System.out.println("Hyvää yötä!");
		}

	}

}
