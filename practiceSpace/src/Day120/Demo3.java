package Day120;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Demo3 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StringTokenizer st;
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static int N, L, M, cnt = 0;
	private static final int MAXN = (int) 5e5 + 10;
	private static final int MAXM = (int) 1e3 + 10;
	private static int[][] trie = new int[MAXN][26];

	private static boolean[][] flag = new boolean[MAXN][MAXM];

	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(reader.readLine());
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(reader.readLine());
			L = Integer.parseInt(st.nextToken());
			while (L-- > 0) {
				String word = st.nextToken();
				insert(word, i);
			}
		}

		M = Integer.parseInt(reader.readLine());
		for (int i = 0; i < M; i++) {
			String word = reader.readLine();
			check(word);
		}

		writer.flush();
		writer.close();
		reader.close();
	}

	private static void insert(String word, int x) {
		int now = 0;
		for (char c : word.toCharArray()) {
			int p = c - 'a';
			if (trie[now][p] == 0) {
				trie[now][p] = ++cnt;
			}
			now = trie[now][p];
		}
		flag[now][x] = true;
	}

	private static void check(String word) {
		int now = 0;
		for (char c : word.toCharArray()) {
			int p = c - 'a';
			if (trie[now][p] == 0) {
				writer.println();
				return;
			}
			now = trie[now][p];
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			if (flag[now][i]) {
				sb.append(i).append(" ");
			}
		}
		writer.println(sb.toString().trim());
	}

}
