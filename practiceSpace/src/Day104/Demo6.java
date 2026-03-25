package Day104;

import java.util.Arrays;
import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
		}

		Arrays.sort(arr);
		long minSteep = 0;
		for (int i = 1; i < arr.length; i++) {
			minSteep += Math.abs(arr[i] - arr[i - 1]);
		}

		boolean allEqual = true;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[0]) {
				allEqual = false;
				break;
			}
		}

		int ways = allEqual ? 1 : 2;
		System.out.println(ways + " " + minSteep);

		reader.close();
	}

}
