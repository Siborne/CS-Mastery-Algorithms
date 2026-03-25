package Day89;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();
		Map<String, String> map = new HashMap<>();
		for (int i = 0; i < m; i++) {
			String s1 = reader.next();
			String s2 = reader.next();
			if (s1.length() > s2.length()) {
				map.put(s1, s2);
			} else {
				map.put(s1, s1);
			}
		}
		reader.nextLine();
		String[] strs = reader.nextLine().split(" ");
		for (String str : strs) {
			System.out.print(map.get(str) + " ");
		}

		reader.close();
	}

}
