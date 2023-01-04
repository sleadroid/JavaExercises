package tehtävä;
import java.util.Scanner;

public class Maalaus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Anna huoneen leveys, pituus ja korkeus: ");
		double leveys = sc.nextDouble();
		double pituus = sc.nextDouble();
		double korkeus = sc.nextDouble();
		
		System.out.print("Paljonko litralla saadaan maalattua neliöitä: ");
		double litralla = sc.nextDouble();
		
		double tarve = (leveys + leveys + pituus + pituus) * korkeus / litralla;
		
		System.out.print("Maalin tarve on " + String.format("%.2f",tarve) + " litraa");
		
	}

}
