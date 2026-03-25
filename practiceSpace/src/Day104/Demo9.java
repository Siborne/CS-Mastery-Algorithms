package Day104;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		reader.nextLine();
		while (t-- > 0) {
			String line = reader.nextLine();
			int sum1 = Integer.valueOf(line.substring(0, 1)) + Integer.valueOf(line.substring(1));
			int sum2 = Integer.valueOf(line.substring(0, line.length() - 1))
					+ Integer.valueOf(line.substring(line.length() - 1));
			int ans = sum1 > sum2 ? sum1 : sum2;

			System.out.println(ans);
		}
		reader.close();
	}

}
