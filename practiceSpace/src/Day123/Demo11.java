package Day123;

import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextInt()) {
			int n = reader.nextInt();
			if (n == 0) {
				break;
			}
			int fuCnt = 0;
			int zhengCnt = 0;
			int zeroCnt = 0;
			for (int i = 0; i < n; i++) {
				double x = reader.nextDouble();
				if (x == 0) {
					zeroCnt++;
				} else if (x > 0) {
					zhengCnt++;
				} else {
					fuCnt++;
				}
			}
			System.out.println(fuCnt + " " + zeroCnt + " " + zhengCnt);
		}

		reader.close();
	}

}
