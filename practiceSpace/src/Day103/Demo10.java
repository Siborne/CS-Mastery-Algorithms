package Day103;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int x1 = reader.nextInt();
		int y1 = reader.nextInt();
		int x2 = reader.nextInt();
		int y2 = reader.nextInt();

		double de = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		double dm = Math.abs(x1 - x2) + Math.abs(y1 - y2);
		double ans = Math.abs(dm - de);
		System.out.println(ans);
		reader.close();
	}

}
