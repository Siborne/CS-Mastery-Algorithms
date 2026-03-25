package Day74;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int k = reader.nextInt();
		Map<String, Integer> memo = new HashMap<>();

		System.out.println(count(n,k,1,memo));
		reader.close();
	}

	private static int count(int n, int k, int min, Map<String, Integer> memo) {
		String key = n + "," + k + "," + min;

		if(memo.containsKey(key)) {
			return memo.get(key);
		}
		
		if (k == 1) {
			return n >= min ? 1 : 0;
		}

		int total = 0;
		for (int i = min; i <= n / k; i++) {
			total+=count(n-i,k-1,i,memo);
		}

		memo.put(key, total);
		return total;

	}

}
