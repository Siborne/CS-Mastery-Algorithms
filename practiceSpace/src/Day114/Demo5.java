package Day114;

import java.util.Arrays;
import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();
		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			arr[i][0] = reader.nextInt();
			arr[i][1] = reader.nextInt();
		}
		Arrays.sort(arr, (o1, o2) -> {
			if (o1[1] != o2[1]) {
				return Integer.compare(o2[1], o1[1]);
			} else {
				return Integer.compare(o1[0], o2[0]);
			}
		});

		int targetM = (int) Math.floor(m * 1.5) - 1;
		int targetScore = arr[targetM][1];
		while (arr[targetM][1] == targetScore) {
			targetM++;
		}
		System.out.println(targetScore + " " + (targetM));
		for (int[] a : arr) {
			if (a[1] < targetScore) {
				break;
			}
			System.out.println(a[0] + " " + a[1]);
		}

		reader.close();
	}

}
