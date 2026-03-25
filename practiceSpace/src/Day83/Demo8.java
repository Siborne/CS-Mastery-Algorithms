package Day83;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		Map<String, Integer> map = new HashMap<>();
		reader.nextLine();
		char[] chs = reader.nextLine().toCharArray();
		for (int i = 0; i < chs.length - 1; i++) {
			String s = chs[i] + "" + chs[i + 1];
			map.put(s, map.getOrDefault(s, 0) + 1);
		}

		String ans = null;
		int max = Integer.MIN_VALUE;
		for (Entry<String, Integer> e : map.entrySet()) {
			String key = e.getKey();
			Integer value = e.getValue();
			if (max < value) {
				max = value;
				ans = key;
			}
		}

		System.out.println(ans);
		reader.close();
	}

}
