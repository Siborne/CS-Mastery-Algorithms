package Day84;

import java.util.Scanner;

public class Demo15 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int x1 = reader.nextInt();
		int y1 = reader.nextInt();
		int z1 = reader.nextInt();
		int x2 = reader.nextInt();
		int y2 = reader.nextInt();
		int z2 = reader.nextInt();
		
		double ans = Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2)+Math.pow(z1-z2, 2));
		System.out.println(String.format("%.2f", ans));
		
		reader.close();
	}

}
