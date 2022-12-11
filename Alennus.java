package tehtävä;
import java.util.Scanner;

public class Alennus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Anna alentamaton hinta: ");	
	               
		double hinta = sc.nextDouble();
		
		System.out.println("Anna alennusprosentti: ");	
	               
		double alennus = sc.nextDouble();
	 
		double tulos = hinta * (100 - alennus) / 100;
	 
		System.out.println("Alennettu hinta on " + String.format("%.2f", tulos));
	}

}
