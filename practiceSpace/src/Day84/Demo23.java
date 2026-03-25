package Day84;

import java.util.Scanner;

public class Demo23 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		double km = reader.nextDouble();
		double m = km*1000;
		System.out.println(String.format("%.2f公里=%.2f米", km,m));
		
		reader.close();
	}
	
}
