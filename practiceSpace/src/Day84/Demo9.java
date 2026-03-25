package Day84;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int x = reader.nextInt();
			min = Math.min(x, min);
			max = Math.max(x, max);
			map.put(x, map.getOrDefault(x, 0) + 1);
		}

		int ans1 = max - min;
		long ans2;
		if (min == max) {
			ans2 = (long) n * (n - 1) / 2;
		} else {
			ans2 = (long) map.get(min) * map.get(max);
		}

		System.out.println(ans1 + " " + ans2);
		reader.close();
	}

}
