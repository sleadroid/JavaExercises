package tehtävä;
import java.util.Scanner;

public class Cooper {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Anna juostu matka: ");
		int matka = sc.nextInt();
		
		int kierrokset = matka / 400;
		
		System.out.print("Kokonaisia 400 metrin kierroksia oli " + kierrokset);

	}

}
