package Day103;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int c = reader.nextInt();
		int d = reader.nextInt();
		double ans = (1.0 * d) / c * 100;
		System.out.println(String.format("%.3f", ans) + "%");
		reader.close();
	}

}
