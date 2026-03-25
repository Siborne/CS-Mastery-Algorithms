package Day36;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Demo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

	private static int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13 };
	private static void solve() {
		backtracing(0);
	}

	private static void backtracing(int index) {
		if (index == arr.length) {
			if (check()) {
				System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
				System.exit(0);
			}
			return;
		}

		for (int i = index; i < arr.length; i++) {
			swap(i, index);
			backtracing(index + 1);
			swap(i, index);
		}
	}

	private static boolean check() {
		Set<Integer> set = new HashSet<>();
//System.out.println(1);
		int sum1 = arr[0] + arr[1] + arr[2] + arr[3];
		int sum2 = arr[2] + arr[4] + 6 + 11;
		int sum3 = arr[3] + arr[4] + arr[5] + arr[6];
		int sum4 = 6 + arr[1] + arr[9] + 14;
		int sum5 = arr[0] + arr[9] + arr[8] + arr[10];
		int sum6 = arr[10] + arr[7] + arr[5] + 11;
		int sum7 = arr[6] + arr[7] + arr[8] + 14;
		Collections.addAll(set, sum1, sum2, sum3, sum4, sum5, sum6, sum7);

		return set.size() == 1;
	}

	private static void swap(int a, int b) {
		if (a == b) {
			return;
		}
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
