package Day75;

import java.util.Scanner;

public class Demo33 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int x1 = reader.nextInt();
		int y1 = reader.nextInt();
		int x2 = reader.nextInt();
		int y2 = reader.nextInt();
		int x3 = reader.nextInt();
		int y3 = reader.nextInt();
		
		double ans = 0.5*Math.abs(x1*y2+x2*y3+x3*y1-x1*y3-x2*y1-x3*y2);
		System.out.printf("%.2f",ans);
		reader.close();
	}
	
}
