package tehtävä;
import java.util.Scanner;

public class Puoluetuki {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Anna kansanedustajien lukumäärä: ");
		int edustajat = sc.nextInt();
		
		int tuki = edustajat * 148175;
		
		System.out.print("Puoluetuen määrä on " + tuki + "euroa");

	}

}
