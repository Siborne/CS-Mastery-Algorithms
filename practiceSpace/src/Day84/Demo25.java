package Day84;

import java.util.Scanner;

public class Demo25 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int f = reader.nextInt();
		double c = 9*(f-32.0)/5;
		
		System.out.println(String.format("%.6f", c));
		
		reader.close();
	}
	
}
