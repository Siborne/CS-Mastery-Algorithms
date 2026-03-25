package Day129;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		char[] chs = reader.nextLine().toCharArray();
		Map<Character, Integer> map = new HashMap<>();

		for (char c : chs) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		boolean flag = true;
		for (int i : map.values()) {
			if ((i & 1) == 1) {
				flag = false;
				break;
			}
		}
		System.out.println(flag ? "YES" : "NO");

		reader.close();
	}

}
