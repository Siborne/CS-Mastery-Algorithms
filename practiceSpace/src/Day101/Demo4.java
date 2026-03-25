package Day101;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		reader.nextLine();
		while (t-- > 0) {
			Map<Character, Integer> map = new HashMap<>();
			char[] chs = reader.nextLine().toCharArray();
			for (char ch : chs) {
				map.put(ch, map.getOrDefault(ch, 0) + 1);
			}

			if (map.size() != 2) {
				System.out.println("No");
				continue;
			}

			boolean flag1 = false;
			boolean flag2 = false;
			for (Character key : map.keySet()) {
				int val = map.get(key);
				if (val == 3) {
					flag1 = true;
				}
				if (val == 1) {
					flag2 = true;
				}
			}
			System.out.println(flag1 && flag2 ? "Yes" : "No");

		}
		reader.close();
	}

}
