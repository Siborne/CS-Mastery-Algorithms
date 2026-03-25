package Day94;

import java.util.Arrays;
import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		reader.nextLine();
		double[] arr = Arrays.stream(reader.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
		double max = 0;
		double ans = 10;
		for (int i = 0; i < n - 1; i++) {
			max = Math.max(max, arr[i]);
			ans = Math.max(ans, 10 * max / 10000 / (arr[i + 1] / 10000));
		}
		System.out.println(String.format("%.2f", ans));
		reader.close();
	}

}
