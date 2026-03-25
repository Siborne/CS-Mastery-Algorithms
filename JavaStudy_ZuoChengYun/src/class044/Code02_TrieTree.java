package class044;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Code02_TrieTree {

	private static final int MAXN = 150001;

	private static int[][] tree = new int[MAXN][26];

	private static int[] end = new int[MAXN];

	private static int[] pass = new int[MAXN];

	private static int cnt;

	private static void build() {
		cnt = 1;
	}

	private static void insert(String word) {
		int cur = 1;
		pass[cur]++;
		for (int i = 0, path; i < word.length(); i++) {
			path = word.charAt(i) - 'a';
			if (tree[cur][path] == 0) {
				tree[cur][path] = ++cnt;
			}
			cur = tree[cur][path];
			pass[cur]++;
		}
		end[cur]++;
	}

	private static int search(String word) {
		int cur = 1;
		for (int i = 0, path; i < word.length(); i++) {
			path = word.charAt(i) - 'a';
			if (tree[cur][path] == 0) {
				return 0;
			}
			cur = tree[cur][path];
		}
		return end[cur];
	}

	private static int prefixNumber(String pre) {
		int cur = 1;
		for (int i = 0, path; i < pre.length(); i++) {
			path = pre.charAt(i) - 'a';
			if (tree[cur][path] == 0) {
				return 0;
			}
			cur = tree[cur][path];
		}
		return pass[cur];
	}

	private static void delete(String word) {
		if (search(word) > 0) {
			int cur = 1;
			pass[cur]--;
			for (int i = 0, path; i < word.length(); i++) {
				path = word.charAt(i) - 'a';
				if (--pass[tree[cur][path]] == 0) {
					tree[cur][path] = 0;
					return;
				}
				cur = tree[cur][path];
			}
			end[cur]--;
		}
	}

	private static void clear() {
		for (int i = 1; i <= cnt; i++) {
			Arrays.fill(tree[i], 0);
			end[i] = 0;
			pass[i] = 0;
		}
	}

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));
	private static int m, op;
	private static String[] splits;

	public static void main(String[] args) throws IOException {
		String line = null;
		while ((line = reader.readLine()) != null) {
			build();
			m = Integer.parseInt(line);
			for (int i = 0; i < m; i++) {
				splits = reader.readLine().split("\\s+");
				op = Integer.parseInt(splits[0]);
				if (op == 1) {
					insert(splits[1]);
				} else if (op == 2) {
					delete(splits[1]);
				} else if (op == 3) {
					writer.println(search(splits[1]) > 0 ? "YES" : "NO");
				} else if (op == 4) {
					writer.println(prefixNumber(splits[1]));
				}
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
