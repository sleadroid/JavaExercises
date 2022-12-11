package teht�v�;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Kotitalousvahennys {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			double korvaus = 0;
		    double tulos = 0;
		    
		    System.out.print("Anna työkorvauksen määrä (0 lopettaa): ");
		    
		    while((korvaus=sc.nextDouble()) != 0) {
		    	tulos = korvaus + tulos;
		    	System.out.print("Anna työkorvauksen määrä (0 lopettaa): ");
		    	}
		    
		    double vahennys = ((tulos * 50) / 100) - 100;
		    
		    if (vahennys > 2400) {
		    	vahennys = 2400;
		    }
		    
		    if (vahennys < 0) {
		    	vahennys = 0;
		    }
		    
		    System.out.println("Kotitalousvähennyksen määrä on " + String.format("%.2f", vahennys) + " euroa");

	}

}
