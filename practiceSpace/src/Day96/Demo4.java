package Day96;

import java.util.Arrays;
import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[] arr = new int[3];
		for (int i = 0; i < 3; i++)
			arr[i] = reader.nextInt();
		Arrays.sort(arr);
		for (int i = 0; i < 3; i++) {
			System.out.print(arr[i] + " ");
		}
		reader.close();
	}

}
