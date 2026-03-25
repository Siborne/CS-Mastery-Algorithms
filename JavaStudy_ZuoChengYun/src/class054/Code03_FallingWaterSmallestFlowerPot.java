package class054;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Code03_FallingWaterSmallestFlowerPot {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static final int MAXN = (int) 1e5 + 1;

	private static int[] maxDeque = new int[MAXN];
	private static int[] minDeque = new int[MAXN];
	private static int maxHead, maxTail, minHead, minTail;

	private static int n, d;
	private static int[][] arr = new int[MAXN][2];

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			d = (int) st.nval;
			for (int i = 0; i < n; i++) {
				st.nextToken();
				arr[i][0] = (int) st.nval;
				st.nextToken();
				arr[i][1] = (int) st.nval;
			}
			int ans = compute();
			writer.println(ans == Integer.MAX_VALUE ? -1 : ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static int compute() {
		Arrays.sort(arr, 0, n, (o1, o2) -> Integer.compare(o1[0], o2[0]));
		maxHead = maxTail = minHead = minTail = 0;
		int ans = Integer.MAX_VALUE;
		for (int l = 0, r = 0; l < n; l++) {
			while (!isOk() && r < n) {
				push(r++);
			}
			if (isOk()) {
				ans = Math.min(ans, arr[r - 1][0] - arr[l][0]);
			}
			pop(l);
		}

		return ans;
	}

	private static boolean isOk() {
		int max = maxHead < maxTail ? arr[maxDeque[maxHead]][1] : 0;
		int min = minHead < minTail ? arr[minDeque[minHead]][1] : 0;
		return max - min >= d;
	}

	private static void push(int r) {
		while (maxHead < maxTail && arr[maxDeque[maxTail - 1]][1] <= arr[r][1]) {
			maxTail--;
		}
		maxDeque[maxTail++] = r;
		while (minHead < minTail && arr[minDeque[minTail - 1]][1] >= arr[r][1]) {
			minTail--;
		}
		minDeque[minTail++] = r;
	}

	private static void pop(int l) {
		if (maxHead < maxTail && maxDeque[maxHead] == l) {
			maxHead++;
		}
		if (minHead < minTail && minDeque[minHead] == l) {
			minHead++;
		}
	}

}
