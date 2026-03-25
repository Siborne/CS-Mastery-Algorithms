package Day83;

import java.util.Arrays;
import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int[] arr = new int[3];
			for (int i = 0; i < 3; i++) {
				arr[i] = reader.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(arr[2] - arr[0]);
		}

		reader.close();
	}

}
