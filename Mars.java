package tehtävä;

import java.util.Scanner;

import java.util.Arrays;

public class Mars {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int mittaus = 0;
		double sum = 0;
		int[] mittaukset;
		
		mittaukset = new int[10];
		
		for (int i = 0; i < mittaukset.length; i++) {
			
			System.out.print("Syötä mittaus " + (i+1) + "/10: " );
			mittaus = sc.nextInt();
			
			if (mittaus >= -140 && mittaus <= 20) {
				mittaukset[i] = mittaus;
				sum = sum + mittaus;
			} 
			
			if (mittaus < -140 || mittaus > 20) {
				i = i - 1;
				System.out.println("Anna lämpötila väliltä -140 - +20!" );
			}
			
		}
		
		Arrays.sort(mittaukset);
		
		double mid = sum / 10;
		int min = mittaukset[0];
		int max = mittaukset[mittaukset.length-1];
		
		System.out.println("Mittausten keskiarvo:" + mid);
		System.out.println("Pienin mittaustulos: " + min); 
		System.out.println("Suurin mittaustulos: " + max);
		
	}

}
