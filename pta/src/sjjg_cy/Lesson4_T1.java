package sjjg_cy;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Lesson4_T1 {

	private static class TreeNode {
		private int val;
		private TreeNode left;
		private TreeNode right;
		private boolean flag;

		private TreeNode(int val) {
			// TODO Auto-generated constructor stub
			this.val = val;
			this.left = this.right = null;
			flag = false;
		}
	}

	private static BufferedReader reader;
	private static StreamTokenizer st;
	private static PrintWriter writer;

	static {
		reader = new BufferedReader(new InputStreamReader(System.in));
		st = new StreamTokenizer(reader);
		writer = new PrintWriter(new BufferedOutputStream(System.out));
	}

	private static int N, L;
	private static TreeNode T;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			N = (int) st.nval;
			if (N == 0) {
				break;
			}
			st.nextToken();
			L = (int) st.nval;
			T = makeTree(N);
			for (int i = 0; i < L; i++) {
				if (judge(T, N)) {
					writer.println("Yes");
				} else {
					writer.println("No");
				}
				reset(T);
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static void reset(TreeNode T) {
		// TODO Auto-generated method stub
		if (T.left != null) {
			reset(T.left);
		}
		if (T.right != null) {
			reset(T.right);
		}
		T.flag = false;
	}

	private static TreeNode makeTree(int N) throws IOException {
		// TODO Auto-generated method stub
		TreeNode T;
		int i, val;
		st.nextToken();
		val = (int) st.nval;
		T = new TreeNode(val);
		for (i = 1; i < N; i++) {
			st.nextToken();
			val = (int) st.nval;
			T = insert(T, val);
		}
		return T;
	}

	private static TreeNode insert(TreeNode T, int val) {
		// TODO Auto-generated method stub
		if (T == null) {
			T = new TreeNode(val);
		} else {
			if (val > T.val) {
				T.right = insert(T.right, val);
			} else {
				T.left = insert(T.left, val);
			}
		}
		return T;
	}

	private static boolean judge(TreeNode T, int N) throws IOException {
		// TODO Auto-generated method stub
		int i, val;
		boolean flag = false;
		st.nextToken();
		val = (int) st.nval;
		if (val != T.val) {
			flag = true;
		} else {
			T.flag = true;
		}
		for (i = 1; i < N; i++) {
			st.nextToken();
			val = (int) st.nval;
			if ((!flag) && (!check(T, val))) {
				flag = true;
			}
		}
		return !flag;
	}

	private static boolean check(TreeNode T, int val) {
		// TODO Auto-generated method stub
		if (T.flag) {
			if (val < T.val) {
				return check(T.left, val);
			} else if (val > T.val) {
				return check(T.right, val);
			} else {
				return false;
			}
		} else {
			if (val == T.val) {
				T.flag = true;
				return true;
			} else {
				return false;
			}
		}
	}

}
