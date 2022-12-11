package teht�v�;
import java.util.Scanner;

public class Pikavippi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Anna pikavipin määrä euroissa: ");
		
		double maara = sc.nextDouble();
		
		System.out.print("Moneksiko vuodeksi raha halutaan (1 tai 2): ");
		
		int vuosi = sc.nextInt();
		
		System.out.print("Lainakorko kahdesta yleisestä (41% tai 37%): ");
		
		double korko = sc.nextDouble() / 100;
		
		System.out.print("Lainatut rahat maksavat eli korko " + (maara * korko * vuosi));
		
	}

}
