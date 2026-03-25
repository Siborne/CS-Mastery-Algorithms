package Day93;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo8 {

	private static Map<String, Integer> map;
	static {
		map = new HashMap<>();
		map.put("a", 1);
		map.put("e", 1);
		map.put("i", 1);
		map.put("o", 1);
		map.put("u", 1);
		map.put("A", 1);
		map.put("E", 1);
		map.put("I", 1);
		map.put("O", 1);
		map.put("U", 1);
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String c = reader.nextLine();
		if (map.containsKey(c)) {
			System.out.println("Y");
		} else {
			System.out.println("N");
		}
		reader.close();
	}

}
