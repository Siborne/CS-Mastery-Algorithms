package Day110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Deque;
import java.util.LinkedList;

public class Demo1 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static final int MAXN = (int) 1e6 + 10;

	private static class Node {
		private int left;
		private int right;

		private Node(int left, int right) {
			this.left = left;
			this.right = right;
		}

	}

	private static int n;
	private static int ans;
	private static Node[] tree = new Node[MAXN];

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;

			for (int i = 1; i <= n; i++) {
				st.nextToken();
				int left = (int) st.nval;
				st.nextToken();
				int right = (int) st.nval;
				tree[i] = new Node(left, right);
			}

			ans = 0;
//			dfs(1, 1);
			dfsIterative(1);
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static void dfsIterative(int root) {
		if (root == 0) {
			return;
		}
		Deque<int[]> stack = new LinkedList<>();
		stack.push(new int[] { root, 1 });

		while (!stack.isEmpty()) {
			int[] pair = stack.pop();
			int id = pair[0];
			int deep = pair[1];
			ans = Math.max(ans, deep);

			if (tree[id].right != 0) {
				stack.push(new int[] { tree[id].right, deep + 1 });
			}
			if (tree[id].left != 0) {
				stack.push(new int[] { tree[id].left, deep + 1 });
			}
		}

	}

	private static void dfs(int id, int deep) {
		if (id == 0) {
			return;
		}
		ans = Math.max(ans, deep);
		dfs(tree[id].left, deep + 1);
		dfs(tree[id].right, deep + 1);
	}

}
