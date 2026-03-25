package Day123;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while (reader.hasNextDouble()) {
			double x1 = reader.nextDouble();
			double y1 = reader.nextDouble();
			double x2 = reader.nextDouble();
			double y2 = reader.nextDouble();
			double ans = Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
			System.out.printf("%.2f",ans);
			System.out.println();
		}
		
		reader.close();
	}
	
}
