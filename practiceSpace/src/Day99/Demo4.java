package Day99;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		Map<String, Long> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(reader.next(), 0L);
		}
		int m = reader.nextInt();
		while (m-- > 0) {
			int opt = reader.nextInt();
			if (opt == 1) {
				String x = reader.next();
				long y = reader.nextLong();
				if (map.containsKey(x)) {
					map.put(x, map.get(x) + y);
				}
			} else if (opt == 2) {
				String x = reader.next();
				if (map.containsKey(x)) {
					System.out.println(map.get(x));
				} else {
					System.out.println(-1);
				}
			}
		}

		reader.close();
	}

}
