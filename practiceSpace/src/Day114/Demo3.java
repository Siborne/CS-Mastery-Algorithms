package Day114;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		TreeMap<Integer, Integer> map = new TreeMap<>();
		int n = reader.nextInt();
		for (int i = 0; i < n; i++) {
			int key = reader.nextInt();
			map.put(key, map.getOrDefault(key, 0) + 1);
		}

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		reader.close();
	}

}
