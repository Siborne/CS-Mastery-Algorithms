package sjjg_cy;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Stack;

public class Lesson2_T3 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int M, N, K;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			M = (int) st.nval;
			st.nextToken();
			N = (int) st.nval;
			st.nextToken();
			K = (int) st.nval;
			for (int i = 0; i < K; i++) {
				int[] popSequence = new int[N];
				for (int j = 0; j < N; j++) {
					st.nextToken();
					popSequence[j] = (int) st.nval;
				}

				if (isPossibleSequence(M, N, popSequence)) {
					writer.println("YES");
				} else {
					writer.println("NO");
				}

			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static boolean isPossibleSequence(int maxCapatity, int n, int[] popSequence) {
		Stack<Integer> stack = new Stack<>();
		int currentPush = 1;
		for (int i = 0; i < n; i++) {
			int target = popSequence[i];
			while (stack.isEmpty() || stack.peek() != target) {
				if (currentPush > n) {
					return false;
				}
				if (stack.size() >= maxCapatity) {
					return false;
				}
				stack.push(currentPush);
				currentPush++;
			}
			stack.pop();
		}
		return true;
	}

}
