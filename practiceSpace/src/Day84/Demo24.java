package Day84;

import java.util.Scanner;

public class Demo24 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		double c = reader.nextDouble();
		double f = 1.8*c+32;
		
		System.out.println(String.format("%.2f C=%.2f F", c,f));
		reader.close();
	}
	
}
