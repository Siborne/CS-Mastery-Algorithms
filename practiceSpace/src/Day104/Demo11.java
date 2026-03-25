package Day104;

import java.util.Arrays;
import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = reader.nextInt();
		}
		Arrays.sort(arr);

		boolean flag = true;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - arr[i - 1] < 1) {
				flag = false;
				break;
			}
		}
		System.out.println(flag ? "YES" : "NO");
		reader.close();
	}

}
