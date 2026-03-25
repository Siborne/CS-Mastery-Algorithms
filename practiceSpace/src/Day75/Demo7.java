package Day75;

import java.util.Scanner;

public class Demo7 {

	private static final double PI = 3.1415926;
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		double r = reader.nextDouble();
		double h = reader.nextDouble();
		
		double ans1 = 2*PI*r;
		double ans2 = PI*r*r;
		double ans3 = 4*PI*r*r;
		double ans4 = 4*PI*r*r*r/3;
		double ans5 = PI*r*r*h;
		
		System.out.printf("%.2f\n%.2f\n%.2f\n%.2f\n%.2f",ans1,ans2,ans3,ans4,ans5);
		
		
		reader.close();
	}
	
}
