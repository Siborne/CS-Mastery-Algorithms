package class036;

import class036.Code02_ZigzagLevelOrderTraversal.TreeNode;

public class Code03_WidthOfBinaryTree1 {
	// 不提交这个类
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;
	}

	private static int MAXN = 3001;
	private static TreeNode[] nq = new TreeNode[MAXN];
	private static long[] iq = new long[MAXN];
	private static int l, r;

	public int widthOfBinaryTree(TreeNode root) {
		int ans = 1;
		l = r = 0;
		nq[r] = root;
		iq[r++] = 1;
		while (l < r) {
			int size = r - l;
			ans = Math.max(ans, (int) (iq[r - 1] - iq[l] + 1));

			for (int i = 0; i < size; i++) {
				TreeNode node = nq[l];
				long id = iq[l++];
				if (node.left != null) {
					nq[r] = node.left;
					iq[r++] = id * 2;
				}
				if (node.right != null) {
					nq[r] = node.right;
					iq[r++] = id * 2 + 1;
				}
			}

		}
		return ans;
	}
}
