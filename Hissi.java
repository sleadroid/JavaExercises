package tehtävä;
import java.util.Scanner;

public class Hissi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int paino = 0;
	    int yhteensa = 0;
	    
	    System.out.print("Paljonko painat:  ");
	    
	    while(yhteensa < 240 && (paino=sc.nextInt()) != 0) {
	    	yhteensa = paino + yhteensa;
	    	if (yhteensa < 240) {
	    		System.out.println("Tule kyytiin.");
		    	System.out.print("Paljonko painat: ");
	    	}
	    }
	    
	    if (paino == 0) {
	    	System.out.println("");
	    } else {
	    	System.out.println("Hissi on jo tÃ¤ynnÃ¤. Odota seuraavaa hissiÃ¤.");
	    }
	    
	}

}
