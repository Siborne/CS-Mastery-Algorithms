package class043;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Code01_KillMonsterEverySkillUseOnce {

	private static final int MAXN = 11;
	private static int[] kill = new int[MAXN];
	private static int[] blood = new int[MAXN];

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int t, n, m;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			t = (int) st.nval;
			for (int i = 0; i < t; i++) {
				st.nextToken();
				n = (int) st.nval;
				st.nextToken();
				m = (int) st.nval;
				for (int j = 0; j < n; j++) {
					st.nextToken();
					kill[j] = (int) st.nval;
					st.nextToken();
					blood[j] = (int) st.nval;
				}
				int ans = f(n, 0, m);
				writer.println(ans == Integer.MAX_VALUE ? -1 : ans);
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static int f(int n, int i, int r) {
		if (r <= 0) {
			return i;
		}
		if (i == n) {
			return Integer.MAX_VALUE;
		}
		int ans = Integer.MAX_VALUE;
		for (int j = i; j < n; j++) {
			swap(i, j);
			ans = Math.min(ans, f(n, i + 1, r - (r > blood[i] ? kill[i] : kill[i] * 2)));
			swap(i, j);
		}
		return ans;
	}

	private static void swap(int i, int j) {
		int temp = kill[i];
		kill[i] = kill[j];
		kill[j] = temp;
		temp = blood[i];
		blood[i] = blood[j];
		blood[j] = temp;
	}

}
