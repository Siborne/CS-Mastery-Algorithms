package s2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class T8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] arr = new int[n];
		int[] brr = new int[n];
		for (int i = 0; i < n; i++) {
			int x = reader.nextInt();
			arr[i] = x;
			brr[i] = x;
		}

		Arrays.sort(brr);
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int value = brr[i];
			if(!map.containsKey(value)) {
				map.put(value, i+1);
			}
		}

//		for (Map.Entry entry : map.entrySet()) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}

		for (int i = 0; i < n; i++) {
			System.out.print(map.get(arr[i]) + " ");
		}

		reader.close();
	}

}
