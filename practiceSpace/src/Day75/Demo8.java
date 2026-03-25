package Day75;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int x = reader.nextInt();
		int a = reader.nextInt();
		double ans = 0.5*(a*x+(a+x)/(4.0*a));
		System.out.printf("%.2f",ans);
		
		reader.close();
	}
	
}
