package teht‰v‰;
import java.util.Scanner;

public class Bitcoin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Anna Bitcoineihin investoidun rahan m‰‰r‰: ");	
	               
		int bitcoin = sc.nextInt();
		
		// HUOM! Ohjeissa kerrottiin kertoimeksi 15,06 mutta itse teht‰v‰ haluaa kertoimeksi 14,06!
		System.out.println("Bitcoin tuotti vuodessa " + (14.06 * bitcoin) + " euroa");

	}

}
