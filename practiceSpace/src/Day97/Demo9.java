package Day97;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
		}
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i < n - 1; i++) {
			if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
				list.add(arr[i]);
			}
		}
		for (int a : list) {
			System.out.println(a);
		}
		reader.close();
	}

}
