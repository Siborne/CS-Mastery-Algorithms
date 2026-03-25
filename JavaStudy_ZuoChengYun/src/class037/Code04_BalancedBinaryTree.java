package class037;

public class Code04_BalancedBinaryTree {

	// 不提交这个类
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;
	}

	private static boolean balance;

	public boolean isBalanced(TreeNode root) {
		balance = true;
		height(root);
		return balance;
	}

	private static int height(TreeNode cur) {
		if (!balance || cur == null) {
			return 0;
		}
		int lh = height(cur.left);
		int rh = height(cur.right);
		if (Math.abs(lh - rh) > 1) {
			balance = false;
		}
		return Math.max(lh, rh) + 1;
	}

}
