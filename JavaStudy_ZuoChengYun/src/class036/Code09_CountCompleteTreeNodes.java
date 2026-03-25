package class036;

public class Code09_CountCompleteTreeNodes {

	// 不提交这个类
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;
	}

	class Solution {
		public int countNodes(TreeNode root) {
			if (root == null) {
				return 0;
			}
			return f(root, 1, mostLeft(root, 1));
		}

		private static int f(TreeNode cur, int level, int h) {
			if (level == h) {
				return 1;
			}
			if (mostLeft(cur.right, level + 1) == h) {
				return (1 << (h - level)) + f(cur.right, level + 1, h);
			} else {
				return (1 << (h - level - 1)) + f(cur.left, level + 1, h);
			}
		}

		private static int mostLeft(TreeNode cur, int level) {
			while (cur != null) {
				level++;
				cur = cur.left;
			}
			return level - 1;
		}

	}

}
