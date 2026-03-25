package Day84;

import java.util.Scanner;

public class Demo13 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		double n = reader.nextDouble();
		double ans1 = Math.sqrt(n);
		double ans2 = Math.log(n);
		double ans3 = Math.log10(n);

		System.out.println(String.format("%.2f %.2f %.2f", ans1, ans2, ans3));

		reader.close();
	}

}
