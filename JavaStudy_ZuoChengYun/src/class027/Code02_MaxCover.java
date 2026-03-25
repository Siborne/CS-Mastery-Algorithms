package class027;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Code02_MaxCover {

	private static final int MAXN = 10001;
	private static int[][] line = new int[MAXN][2];
	private static int n;

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			for (int i = 0; i < n; i++) {
				st.nextToken();
				line[i][0] = (int) st.nval;
				st.nextToken();
				line[i][1] = (int) st.nval;
			}
			writer.println(compute());
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static int compute() {
		size = 0;

		Arrays.sort(line, 0, n, (o1, o2) -> o1[0] - o2[0]);
		int ans = 0;
		for (int i = 0; i < n; i++) {
			while (size > 0 && heap[0] <= line[i][0]) {
				pop();
			}
			add(line[i][1]);
			ans = Math.max(ans, size);
		}
		return ans;
	}

	private static int[] heap = new int[MAXN];

	private static int size;

	private static void add(int x) {
		heap[size] = x;
		int i = size++;
		while (heap[i] < heap[(i - 1) / 2]) {
			swap(i, (i - 1) / 2);
			i = (i - 1) / 2;
		}
	}

	private static void pop() {
		swap(0, --size);
		int i = 0;
		int l = 1;
		while (l < size) {
			int best = l + 1 < size && heap[l + 1] < heap[l] ? l + 1 : l;
			best = heap[best] < heap[i] ? best : i;
			if (best == i) {
				break;
			}
			swap(i, best);
			i = best;
			l = i * 2 + 1;
		}
	}

	private static void swap(int i, int j) {
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}

}
