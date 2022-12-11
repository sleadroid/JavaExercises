package tehtävä;

import java.util.Arrays;
import java.util.Scanner;

public class MerkkijononPalat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Kirjoita lause: ");
        String str = sc.nextLine();
         
        String[] strArray = str.split(" ");
         
        String strFormat = Arrays.toString(strArray);
        
        String strTulos = strFormat.toString()
        	    .replace(",", "\n")
        	    .replace("[", "")
        	    .replace("]", "")
        	    .replace(" ", "");
        
        System.out.print(strTulos);
    }
}
