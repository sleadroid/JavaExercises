package tehtävä;
import java.util.Scanner;

public class Bitcoin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Anna Bitcoineihin investoidun rahan määrä: ");	
	               
		int bitcoin = sc.nextInt();
		
		System.out.println("Bitcoin tuotti vuodessa " + (14.06 * bitcoin) + " euroa");

	}

}
