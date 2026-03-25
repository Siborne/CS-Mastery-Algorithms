package Day69;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int[] arr = new int[n + 1];
			for (int i = 1; i <= n; i++) {
				arr[i] = reader.nextInt();
				arr[i] -= i;
			}
			long ans = 0;
			Map<Integer, Integer> map = new HashMap<>();
			for (int i = 1; i <= n; i++) {
				ans += map.getOrDefault(arr[i], 0);
				map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			}
			System.out.println(ans);
		}
		
		reader.close();
	}

}
