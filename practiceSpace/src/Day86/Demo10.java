package Day86;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int max = Integer.MIN_VALUE;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int x = reader.nextInt();
			map.put(x, map.getOrDefault(x, 0) + 1);
			max = Math.max(max, map.get(x));
		}

		List<Integer> list = new ArrayList<>();
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			int key = entry.getKey();
			int value = entry.getValue();
			if (value == max) {
				list.add(key);
			}
		}
		Collections.sort(list);
		for (Integer num : list) {
			System.out.println(num);
		}

		reader.close();
	}

}
