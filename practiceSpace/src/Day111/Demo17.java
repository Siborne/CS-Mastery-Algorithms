package Day111;

import java.util.Scanner;

public class Demo17 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int r = reader.nextInt();
		double ans = Math.PI*r*r;
		
		System.out.printf("%.6f",ans);
		
		reader.close();
	}
	
}
