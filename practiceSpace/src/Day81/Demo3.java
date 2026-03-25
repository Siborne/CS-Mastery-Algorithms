package Day81;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		reader.nextLine();
		String s = reader.nextLine();
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n - 1; i++) {
			map.put(s.substring(i, i + 2), map.getOrDefault(s.substring(i, i + 2), 0) + 1);
		}
		int max = Integer.MIN_VALUE;
		String ans = null;
		 for (Map.Entry<String, Integer> entry : map.entrySet()) {
	            String key = entry.getKey();
	            int count = entry.getValue();

	            if (count > max || (count == max && (ans == null || key.compareTo(ans) < 0))) {
	                max = count;
	                ans = key;
	            }
	        }
		System.out.println(ans);
		reader.close();
	}

}
