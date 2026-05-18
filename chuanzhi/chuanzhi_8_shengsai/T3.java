package chuanzhi_8_shengsai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class T3 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(reader.readLine());
		while (T-- > 0) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			long[][] arr = new long[n][2];
			st = new StringTokenizer(reader.readLine());
			for (int i = 0; i < arr.length; i++) {
				arr[i][0] = Long.parseLong(st.nextToken());
			}
			st = new StringTokenizer(reader.readLine());
			for (int i = 0; i < arr.length; i++) {
				arr[i][1] = Long.parseLong(st.nextToken());
			}

			ans = 0;
			dfs(arr, n, m, 0, 0, 0);
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static long ans = 0;

	private static void dfs(long[][] arr, int n, int m, int now, long sumzs, long sumyl) {
		if (now == n) {
			ans = Math.max(ans, sumzs);
			return;
		}
		if (sumyl + arr[now][1] <= m) {
			dfs(arr, n, m, now + 1, sumzs + arr[now][0], sumyl + arr[now][1]);
		}
		dfs(arr, n, m, now + 1, sumzs, sumyl - arr[now][1] < 0 ? 0 : sumyl - arr[now][1]);
	}

}
