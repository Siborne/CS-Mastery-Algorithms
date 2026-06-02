package global;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T19 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static int n, m;
	private static int[] arr;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;
			arr = new int[n];
			for (int i = 0; i < n; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
			}
			ans = 0;
			dfs(0, 0, 0);
			System.out.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static long ans;

	private static void dfs(int index, int count, int sum) {
		if (count == m) {
			if (isPrime(sum)) {
				ans++;
			}
			return;
		}
		if (index == n) {
			return;
		}
		dfs(index + 1, count, sum);
		dfs(index + 1, count + 1, sum + arr[index]);
	}

	private static boolean isPrime(int n) {
		if (n == 1 || n == 2) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
