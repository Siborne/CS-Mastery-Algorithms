package week1.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int m = reader.nextInt();

		long[] a = new long[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = reader.nextLong();
		}

		boolean[] isDoulbe = new boolean[n];
		for (int i = 0; i < m; i++) {
			int idx = reader.nextInt() - 1;
			isDoulbe[idx] = true;
		}

		List<Long> doubleList = new ArrayList<>();
		long sumNonDouble = 0;

		for (int i = 0; i < n; i++) {
			if (isDoulbe[i]) {
				doubleList.add(a[i]);
			} else {
				sumNonDouble += a[i];
			}
		}

		Collections.sort(doubleList);

		long[] pre = new long[m + 1];
		for (int i = 0; i < m; i++) {
			pre[i + 1] = pre[i] + doubleList.get(i);
		}

		long totalDoubleSum = pre[m];

		long ans = 0;
		for (int i = 0; i <= m; i++) {
			long sumTake = sumNonDouble + (totalDoubleSum - pre[i]);
			long score = sumTake * (1L << i);
			ans = Math.max(ans, score);
		}

		System.out.println(ans);
		reader.close();
	}

}
