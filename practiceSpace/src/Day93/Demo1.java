package Day93;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[] arr = new int[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = reader.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[1]);
		reader.close();
	}

}
