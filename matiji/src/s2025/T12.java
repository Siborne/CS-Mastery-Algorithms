package s2025;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T12 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		reader.nextLine();
		String[] name = reader.nextLine().split("\\s+");
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(name[i], 0);
		}
		int q = reader.nextInt();
		while (q-- > 0) {
			int opt = reader.nextInt();
			String s = reader.next();
			
			if (opt == 1) {
				int y = reader.nextInt();
				if (map.containsKey(s)) {
					map.put(s, map.get(s) + y);
				}
			} else if (opt == 2) {
				if (map.containsKey(s)) {
					System.out.println(map.get(s));
				} else {
					System.out.println(-1);
				}
			}
		}

		reader.close();
	}

}
