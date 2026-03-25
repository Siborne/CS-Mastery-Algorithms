package Day94;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Demo3 {

	private static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		int n = reader.nextInt();
		reader.nextLine();
		Map<String, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < n; i++) {
			String[] strs = reader.nextLine().split("\\s+");
			map.put(strs[0], map.getOrDefault(strs[0], 1000) + Integer.parseInt(strs[1]));
		}

		String ans1 = null;
		int ans2 = Integer.MAX_VALUE;
		for (Entry<String, Integer> entry : map.entrySet()) {
			String name = entry.getKey();
			Integer value = entry.getValue();
			if (value < ans2) {
				ans2 = value;
				ans1 = name;
			}
		}
		System.out.println(ans1);
		System.out.println(ans2);
		reader.close();
	}

}
