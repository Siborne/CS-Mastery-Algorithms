package Day36;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo9 {

	private static int ans;
	private static int[] arr = new int[9];
	private static boolean[] visited = new boolean[9];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		solve();
		reader.close();
	}

	private static void solve() {
		backtracing(0);
		System.out.println(ans / 8);
	}

	private static void backtracing(int index) {
		if (index == arr.length) {
			check();
			return;
		}

		for (int i = 0; i < 9; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[index] = i + 1;
				backtracing(index + 1);
//				System.out.println(1);
				visited[i] = false;
			}
		}

	}

	private static void check() {
		int r1 = arr[0] + arr[1] + arr[2];
		int r2 = arr[3] + arr[4] + arr[5];
		int r3 = arr[6] + arr[7] + arr[8];
		int c1 = arr[0] + arr[3] + arr[6];
		int c2 = arr[1] + arr[4] + arr[7];
		int c3 = arr[2] + arr[5] + arr[8];
		int d1 = arr[0] + arr[4] + arr[8];
		int d2 = arr[2] + arr[4] + arr[6];

		Set<Integer> sums = new HashSet<>();
		Collections.addAll(sums, r1, r2, r3, c1, c2, c3, d1, d2);

		if (sums.size() == 8) {
			ans++;
		}
	}

}
