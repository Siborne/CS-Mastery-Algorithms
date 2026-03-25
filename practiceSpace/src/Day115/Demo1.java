package Day115;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();
		long sum = (long) Math.pow(10, n);
		List<String> str = new ArrayList<>();
		boolean[] vis = new boolean[m];
		for (int i = 0; i < m; i++) {
			str.add(reader.next());
		}

		Collections.sort(str);

		for (int i = 0; i < m; i++) {
			if (vis[i]) {
				continue;
			}
			for (int j = i + 1; j < m; j++) {
				if (!vis[j] && str.get(j).startsWith(str.get(i))) {
					vis[j] = true;
				}
			}
		}

		long cnt = 0;
		for (int i = 0; i < m; i++) {
			if (!vis[i]) {
				int len = str.get(i).length();
				if (n >= len) {
					cnt += (long) Math.pow(10, n - len);
				}
			}
		}
		System.out.println(sum - cnt);
		reader.close();
	}

}
