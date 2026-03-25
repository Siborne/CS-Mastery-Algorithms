package Day129;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int[] arr = new int[] { 200, 250, 240 };
		int[] brr = new int[] { 30, 40, 50 };

		int[][] crr = new int[][] { { 30, 40, 50 }, { 30, 50, 40 }, { 40, 30, 50 }, { 40, 50, 30 }, { 50, 30, 40 },
				{ 50, 40, 30 } };

		int ans = Integer.MIN_VALUE;

		for (int[] c : crr) {
			int cnt = arr[0] / c[0] * arr[1] / c[1] * arr[2] / c[2];
			ans = Math.max(ans, cnt);
		}

		System.out.println(ans);
		reader.close();
	}

}
