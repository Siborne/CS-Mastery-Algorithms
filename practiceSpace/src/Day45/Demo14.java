package Day45;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Demo14 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static final int MAXN = 200000 + 5;

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());

		int[] ff = new int[MAXN];
		int[] f = new int[MAXN];
		int[] fff = new int[MAXN];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			ff[a]++;
			ff[b + 1]--;
		}

		for (int i = 1; i <= MAXN - 1; i++) {
			f[i] = f[i - 1] + ff[i];
			if (f[i] >= k) {
				fff[i] = fff[i - 1] + 1;
			} else {
				fff[i] = fff[i - 1];
			}
		}

		for (int i = 0; i < q; i++) {
			st = new StringTokenizer(reader.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			writer.println(fff[b]-fff[a-1]);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
