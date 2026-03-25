package Day45;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Demo16 {

	private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static final PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		Map<Long, Long> map = new HashMap<>();
		map.put(0L, 1L);

		long prefixSum = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());
			long x = Long.parseLong(st.nextToken());
			prefixSum += x;
			long mod = prefixSum % k;
			if (mod < 0) {
				mod += k;
			}
			map.put(mod, map.getOrDefault(mod, 0L) + 1);
		}

		long ans = 0;
		for(long count : map.values()) {
			ans += (count *(count-1))/2;
		}
		writer.println(ans);
		writer.flush();
		writer.close();
		reader.close();
	}

}
