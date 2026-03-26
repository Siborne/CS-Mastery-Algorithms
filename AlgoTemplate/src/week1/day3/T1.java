package week1.day3;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class T1 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int n, m;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;
			Set<Integer> setA = new HashSet<>();
			Set<Integer> setB = new HashSet<>();
			for (int i = 0; i < n; i++) {
				st.nextToken();
				setA.add((int) st.nval);
			}
			for (int i = 0; i < m; i++) {
				st.nextToken();
				setB.add((int) st.nval);
			}

			List<Integer> listA = new ArrayList<>(setA);
			int limit = n + m;

			boolean[] isPrime = new boolean[limit + 1];
			if (limit >= 2) {
				Arrays.fill(isPrime, 2, limit + 1, true);

				for (int i = 2; i * i <= limit; i++) {
					if (isPrime[i]) {
						for (int j = i * i; j <= limit; j += i) {
							isPrime[j] = false;
						}
					}
				}
			}

			int cnt = 0;

			for (int s = 2; s <= limit; s++) {
				if (!isPrime[s]) {
					continue;
				}
				boolean canForm = false;
				for (int a : listA) {
					int b = s - a;
					if (b > 0 && setB.contains(b)) {
						canForm = true;
						break;
					}
				}
				cnt += canForm ? 1 : 0;
			}

			writer.println(cnt);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
