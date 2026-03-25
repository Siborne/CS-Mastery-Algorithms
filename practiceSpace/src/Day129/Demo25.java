package Day129;

import java.util.Arrays;
import java.util.Scanner;

public class Demo25 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int T = reader.nextInt();
		while (T-- > 0) {
			int n = reader.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = reader.nextInt();
			}
			Arrays.sort(arr);
			boolean flag = true;
			flag = n >= 10 && n <= 13 && arr[0] == 1 && arr[0] == arr[1];
			for (int i = 1; i < arr.length - 1; i++) {
				if (arr[i] - arr[i - 1] > 2) {
					flag = false;
					break;
				}
			}
			System.out.println(flag ? "Yes" : "No");
		}

		reader.close();
	}

}
