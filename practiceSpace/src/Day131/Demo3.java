package Day131;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		while (n-- > 0) {
			int a = reader.nextInt();
			int b = reader.nextInt();
			map.put(a, map.getOrDefault(a, 0) + 1);
			int c = a ^ b;
			if (c==a) {
				continue;
			}
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		int maxCount = 0;
		int res = 0;
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue()>maxCount) {
				res = entry.getKey();
				maxCount = entry.getValue();
			}else if (entry.getValue()==maxCount && entry.getKey()< res) {
				res = entry.getKey();
			}
		}

		System.out.println(res);
		reader.close();
	}

}