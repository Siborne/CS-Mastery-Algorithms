package class036;

public class Code08_CompletenessOfBinaryTree {

	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;
	}

	class Solution {

		private static int MAXN = 101;

		private static TreeNode[] queue = new TreeNode[MAXN];

		private static int l, r;

		public boolean isCompleteTree(TreeNode root) {
			if (root == null) {
				return true;
			}
			l = r = 0;
			queue[r++] = root;
			boolean leaf = false;
			while (l < r) {
				root = queue[l++];
				if ((root.left == null && root.right != null) || (leaf && (root.left != null || root.right != null))) {
					return false;
				}
				if (root.left != null) {
					queue[r++] = root.left;
				}
				if (root.right != null) {
					queue[r++] = root.right;
				}
				if (root.left == null || root.right == null) {
					leaf = true;
				}
			}
			return true;
		}
		
	}
}
