package Round_101;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int score = reader.nextInt();
		
		Double ans = 150*Math.log(score)/Math.log(Math.E);
		
		System.out.println(String.format("%6f", ans));
		reader.close();
	}
	
}
