package Day39;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		solve();
		reader.close();
	}

	private static void solve() {
		int n = 2022;
		int[] q = new int[n];
		q[1] = 0;
		for (int i = 2; i <= 2021; i++) {
			q[i] = Integer.MAX_VALUE;
		}
		for (int i = 1; i <= 2020; i++) {
			for (int j = i + 1; j <= 2021 && (j - i) <= 21; j++) {
				q[j] = Math.min(q[j], q[i]+ le(i,j));
			}
		}

		System.out.println(q[2021]);
	}

	private static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	private static int le(int a, int b) {
		return a * b / gcd(a, b);
	}

}
