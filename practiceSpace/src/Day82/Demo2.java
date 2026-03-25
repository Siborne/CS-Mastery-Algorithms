package Day82;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo2 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
//		Scanner reader = new Scanner(System.in);

		int n = Integer.parseInt(reader.readLine());
		int[] v = new int[n + 1];
		long[][] pre = new long[3][n + 2];
		StringTokenizer st = new StringTokenizer(reader.readLine());
		for (int i = 1; i <= n; i++) {
			v[i] = Integer.parseInt(st.nextToken());
			pre[1][i] = pre[1][i - 1] + v[i];
		}

		int[] vSorted = new int[n + 1];
		System.arraycopy(v, 1, vSorted, 1, n);
		Arrays.sort(vSorted, 1, n + 1);

		for (int i = 1; i <= n; i++) {
			pre[2][i] = pre[2][i - 1] + vSorted[i];
		}

		int m = Integer.parseInt(reader.readLine());
		while (m-- > 0) {
			st = new StringTokenizer(reader.readLine());
			int a = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			writer.println(pre[a][r] - pre[a][l - 1]);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
