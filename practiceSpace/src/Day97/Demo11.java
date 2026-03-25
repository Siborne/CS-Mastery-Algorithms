package Day97;

import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int m = reader.nextInt();
		int n = reader.nextInt();
		int area = m * n;
		int target = Math.max(m, n) * Math.max(m, n);
		int ans = target - area;
		System.out.println(ans);

		reader.close();
	}

}
