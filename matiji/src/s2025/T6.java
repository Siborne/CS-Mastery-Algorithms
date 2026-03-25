package s2025;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] arr = new int[n];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		for (int a : arr) {
			System.out.print((map.get(a)-1) + " ");
		}

		reader.close();
	}

}
