package Day47;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 在此输入您的代码...
		double l = scan.nextDouble();
		double h = scan.nextDouble();
		if (l * h > (int) l * (int) h) {
			System.out.printf("%.1f", Math.round(l * h));
		} else {
			System.out.printf("%d", (int)(l * h));
		}
		scan.close();
	}

}
