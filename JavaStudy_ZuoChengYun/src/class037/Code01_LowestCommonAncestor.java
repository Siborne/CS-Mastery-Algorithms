package class037;

public class Code01_LowestCommonAncestor {
	// 不提交这个类
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;
	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null || root == p || root == q) {
			return root;
		}
		TreeNode l = lowestCommonAncestor(root.left, p, q);
		TreeNode r = lowestCommonAncestor(root.right, p, q);
		if (l != null && r != null) {
			return root;
		}
		if (l == null && r == null) {
			return null;
		}
		return l != null ? l : r;
	}
}
