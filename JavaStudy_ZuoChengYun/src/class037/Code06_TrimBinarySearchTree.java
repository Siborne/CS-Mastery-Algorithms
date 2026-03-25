package class037;

public class Code06_TrimBinarySearchTree {

	// 不提交这个类
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;
	}

	public TreeNode trimBST(TreeNode root, int low, int high) {
		if (root == null) {
			return null;
		}
		if (root.val < low) {
			return trimBST(root.right, low, high);
		}
		if (root.val > high) {
			return trimBST(root.left, low, high);
		}
		root.left = trimBST(root.left, low, high);
		root.right = trimBST(root.right, low, high);
		return root;
	}
}
