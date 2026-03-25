package Day97;

import java.util.Arrays;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[] arr = new int[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = reader.nextInt();
		}
		Arrays.sort(arr);
		boolean flag = true;
		for (int i = 0; i < 2; i++) {
			if (arr[i + 1] - arr[i] != 1) {
				flag = false;
				break;
			}
		}
		System.out.println(flag ? "TRUE" : "FALSE");
		reader.close();
	}

}
