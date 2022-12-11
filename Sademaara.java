package tehtävä;

import java.util.Arrays;

public class Sademaara {
	
	static double[] sademaarat = {47.0,36.6,34.7,37.0,41.9,47.5,61.7,74.8,65.4,69.7,66.1,54.6};
	
	static double summa( ) {
		
		double summa = 0;
		int i;
		
		for (i = 0; i < sademaarat.length; i++)
			summa += sademaarat[i];
		
		return summa;
	}

	public static void main(String[] args) {
		
		System.out.println("Vuoden sademäärä on " + String.format("%.2f",summa()) + "mm");

	}

}
