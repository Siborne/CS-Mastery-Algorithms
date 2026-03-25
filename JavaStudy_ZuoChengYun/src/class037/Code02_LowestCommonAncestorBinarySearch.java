package class037;

public class Code02_LowestCommonAncestorBinarySearch {

	// 不提交这个类
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;
	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		while (root.val != p.val && root.val != q.val) {
			if (Math.min(p.val, q.val) < root.val && root.val < Math.max(p.val, q.val)) {
				break;
			}
			root = root.val < Math.min(p.val, q.val) ? root.right : root.left;
		}
		return root;
	}

}
