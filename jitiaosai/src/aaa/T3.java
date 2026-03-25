package aaa;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();
		int T = reader.nextInt();
		int totalDay = T + 1;
		int len = n * m;
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = reader.nextInt();
		}
		Arrays.sort(arr);
		int minDay = arr[0];
		int[] brr = new int[minDay];
		for (int i = 0; i < brr.length; i++) {
			brr[i] = -1;
		}
		int ans = 0;
//		for (int i = 0; i < brr.length; i++) {
//			System.out.println(i + ":" + brr[i] + " " + arr[i]);
//		}
		while (totalDay-- > 0) {
			int i = 0;
			for (; i < brr.length; i++) {
				// Î´²¥ÖÖ
				if (brr[i] == -1) {
					brr[i] = arr[i] - 1;
					i++;
					break;
				}
				if (brr[i] <= 0) {
					ans++;
					brr[i] = -1;
					i++;
					break;
				}
			}
			for (; i < brr.length; i++) {
				brr[i]--;
			}
		}
		System.out.println(ans);
		reader.close();
	}

}
