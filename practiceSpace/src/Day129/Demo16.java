package Day129;

import java.util.Arrays;
import java.util.Scanner;

public class Demo16 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int[] arr = new int[4];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = reader.nextInt();
		}
		int x = reader.nextInt();
		boolean flag = false;
		if (arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3]) {
			flag = true;
		}

		if (!flag) {
			Arrays.sort(arr);
			arr[0] += x;
			if (arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3]) {
				flag = true;
			}
		}

		System.out.println(flag ? 1 : 0);
		reader.close();
	}

}
