package Round_101;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.List;

public class F {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(reader.readLine());
		long base = Long.parseLong(st.nextToken());
		long c0 = Long.parseLong(st.nextToken());
		int mod = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(reader.readLine());
		Map<Long, Long> map = new HashMap<>();
		map.put(c0, modPow(base, c0, mod));
		long temp = map.get(c0);
		List<Long> list = new ArrayList<>();
		list.add(map.get(c0));
		while (true) {
			if (map.containsKey(temp)) {
				break;
			}
			map.put(temp, modPow(base, temp, mod));
			temp = map.get(temp);
			list.add((temp + list.get(list.size() - 1)) % mod);
		}

		while (q-- > 0) {
			long k = Long.parseLong(reader.readLine());
			k %= map.size();
			if (k == 0) {
				k = map.size();
			}
			System.out.println(list.get((int)(k - 1)));
		}

		writer.flush();
		writer.close();
		reader.close();
	}

	public static long modPow(long base, long exponent, long mod) {
		long result = 1;
		base = base % mod;

		while (exponent > 0) {
			if ((exponent & 1) == 1) {
				result = (result * base) % mod;
			}
			base = (base * base) % mod;
			exponent >>>= 1;
		}

		return result;
	}
}
