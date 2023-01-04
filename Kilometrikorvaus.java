package tehtävä;
import java.util.Scanner;

public class Kilometrikorvaus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int kilometri = 0;
	    int tulos = 0;
	    
	    System.out.print("Anna ajetut kilometrit (0 lopettaa): ");
	    
	    while((kilometri=sc.nextInt()) != 0) {
	    	tulos = kilometri + tulos;
	    	System.out.print("Anna ajetut kilometrit (0 lopettaa): ");
	    	}
	    
	    System.out.println("Yhteensä " + tulos + " kilometriä");
	    System.out.println("Korvaus on " + String.format("%.2f",tulos * 0.43) + " euroa");

	}

}
