package Day99;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int[] arr = new int[n];
		int[] temp = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
			temp[i] = arr[i];
		}
		Arrays.sort(arr);
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int value = arr[i];
			if (!map.containsKey(value)) {
				map.put(value, i + 1);
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(map.get(temp[i]) + " ");
		}

		reader.close();
	}

}
