package tehtävä;
import java.util.Scanner;

public class Juhlat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Anna juhliin tulevien aikuisten määrä: ");
		int aikuiset = sc.nextInt();
		
		int pullot = ((aikuiset / 7) + 1) & ~1;
		
		System.out.println("Pulloja tarvitaan "+ pullot + " kappaletta");
		
		int yliLasit = Math.abs(aikuiset -(7 * pullot));
		
		System.out.println("Viimeisestä pullosta jää "+ yliLasit + " lasia");

	}

}
