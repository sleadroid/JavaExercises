package teht‰v‰;

import java.util.Arrays;
import java.util.Scanner;

public class SanojenVaihtaminen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Kirjoita lause: ");
		String lause = sc.nextLine();
		String[] sanat = lause.split(" ");
		
		System.out.println("Mitk‰ sanat vaihdetaan kesken‰‰n? ");
		String numerot = sc.nextLine();
		String[] numerotSplit = numerot.split(" ");
		
		int first = Integer.parseInt(numerotSplit[0]);
		int second = Integer.parseInt(numerotSplit[1]);
		
		String[] copy = Arrays.copyOf(sanat, sanat.length);
		copy[first] = sanat[second];
		copy[second] = sanat[first];
		
		String format = Arrays.toString(copy)
				.replace(",", "")
				.replace("]", "")
				.replace("[", "");

		System.out.println(format);
	}

}
