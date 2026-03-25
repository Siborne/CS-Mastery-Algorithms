package Day124;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextInt()) {
			int m = reader.nextInt();
			int n = reader.nextInt();
			int maxAbsM = Integer.MAX_VALUE;
			int maxAbsN = Integer.MAX_VALUE;
			int maxAbsValue = Integer.MIN_VALUE;
			for (int i = 1; i <= m; i++) {
				for (int j = 1; j <= n; j++) {
					int x = reader.nextInt();
					if (Math.abs(x) > Math.abs(maxAbsValue) || Math.abs(x) == Math.abs(maxAbsValue)
							&& ((i < maxAbsM) || (i == maxAbsM && j < maxAbsN))) {
						maxAbsValue = x;
						maxAbsM = i;
						maxAbsN = j;

					}
				}
			}
			System.out.println(maxAbsM + " " + maxAbsN + " " + maxAbsValue);
		}

		reader.close();
	}

}
