package Day46;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Demo4 {

	private static int[][] arr;
	private static int[][] brr;
	private static int[][] dict = { { 0, 0 }, { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	private static int n;

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		n = Integer.parseInt(reader.readLine());
		arr = new int[n + 1][n + 1];
		brr = new int[n + 2][n + 2];

		for (int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			for (int j = 1; j <= n; j++) {
				brr[i][j] = Integer.parseInt(st.nextToken());
				if (brr[i][j] == 0) {
					arr[i][j] = 0;
				} else {
					arr[i][j] = 2;
				}
			}
		}

		for (int i = 1; i <= n; i++) {
			if (arr[1][i] == 0) {
				dfs(1, i);
			}
			if (arr[n][i] == 0) {
				dfs(n, i);
			}
		}

		for (int i = 2; i <= n; i++) {
			if (arr[i][1] == 0) {
				dfs(i, 1);
			}
			if (arr[i][n] == 0) {
				dfs(i, n);
			}
		}

		for (int i = 1; i <= n; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 1; j <= n; j++) {
				if (arr[i][j] == 0) {
					sb.append("2 ");
				} else {
					sb.append(brr[i][j]).append(" ");
				}
			}
			writer.println(sb.toString());
		}

		writer.flush();
		writer.close();
		reader.close();
	}

	private static void dfs(int p, int q) {
		// TODO Auto-generated method stub
		if (p < 1 || q < 1 || p > n || q > n || arr[p][q] != 0) {
			return;
		}
		
		arr[p][q] = 1;
		for(int i = 1;i<=4;i++) {
			dfs(p+dict[i][0],q+dict[i][1]);
		}
	}

}
