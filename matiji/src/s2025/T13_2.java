package s2025;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class T13_2 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		char[] chs = reader.readLine().toCharArray();
		int[][] ans = new int[10000 + 5][26 + 5];
		for (int i = 0; i < n; i++) {
//			System.out.println("i:"+i);
			for (int j = 0; j < 26; j++) {
//				System.out.println("j:"+j);
//				System.out.println("ans[i][j]:"+ans[i][j]);
				ans[i + 1][j] = ans[i][j];
			}
//			System.out.println("------");
			ans[i + 1][chs[i] - 'a'] += 1;
		}

		for (int k = 0; k < q; k++) {
			st = new StringTokenizer(reader.readLine());
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			int even = 0;
			for (int i = 0; i < 26; i++) {
				int temp = ans[r][i] - ans[l - 1][i];
				even += temp % 2 == 0 ? 1 : 0;
			}
			int odd = 26 - even;
			writer.println(even + " " + odd);
		}
		writer.flush();
		writer.close();
		reader.close();
	}
	
}
