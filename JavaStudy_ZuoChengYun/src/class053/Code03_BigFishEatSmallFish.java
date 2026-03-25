package class053;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Iterator;

public class Code03_BigFishEatSmallFish {

	private static final int MAXN = (int) 1e5 + 1;
	private static final int[] arr = new int[MAXN];
	private static int n;
	private static final int[][] stack = new int[MAXN][2];
	private static int r;

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			for (int i = 0; i < n; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
			}
			writer.println(turns());
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static int turns() {
		r = 0;
		int ans = 0;
		for (int i = n - 1, curTurns; i >= 0; i--) {
			curTurns = 0;
			while (r > 0 && stack[r - 1][0] < arr[i]) {
				curTurns = Math.max(curTurns + 1, stack[--r][1]);
			}
			stack[r][0] = arr[i];
			stack[r++][1] = curTurns;
			ans = Math.max(ans, curTurns);
		}
		return ans;
	}

	private static final int MAXM = (int) 1e5 + 1;
	private static final int[][] s = new int[MAXM][2];
	private static int size;

	public int totalSteps(int[] nums) {
		int size = 0;
		int ans = 0;
		for (int i = nums.length - 1, curTurns; i >= 0; i--) {
			curTurns = 0;
			while (size > 0 && s[size - 1][0] < nums[i]) {
				curTurns = Math.max(curTurns + 1, s[--size][1]);
			}
			s[size][0] = nums[i];
			s[size++][1] = curTurns;
			ans = Math.max(ans, curTurns);
		}
		return ans;
	}

}
