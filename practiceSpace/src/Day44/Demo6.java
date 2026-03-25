package Day44;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Demo6 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(reader.readLine());
		List<Long> list = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(reader.readLine());
		while (n-- > 0) {
			list.add(Long.parseLong(st.nextToken()));
		}
		list.add(0, Long.MAX_VALUE);
		list.add(Long.MAX_VALUE);
		for (int i = 1; i < list.size() - 1; i++) {
			if (list.get(i) == 1) {
				if (list.get(i - 1) == 2) {
					list.set(i - 1, (long) 3);
				} else if (list.get(i + 1) < list.get(i - 1)) {
					list.set(i + 1, list.get(i + 1) + 1);
				} else {
					list.set(i - 1, list.get(i - 1) + 1);
				}
				list.remove(i--);
			}
		}
		long ans = 1;
		long mod = (long) 1e9 + 7;
		for (int i = 1; i < list.size() - 1; i++) {
			if (list.get(i) != 0) {
				ans = ans * list.get(i) % mod;
			}
		}
		System.out.println(ans);
	}

}
