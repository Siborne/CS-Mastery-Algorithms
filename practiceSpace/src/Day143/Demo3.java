package Day143;

public class Demo3 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	private static int ans;

	public int diameterOfBinaryTree(TreeNode root) {
		ans = 1;
		depth(root);
		return ans - 1;
	}

	private static int depth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftDepth = depth(root.left);
		int rightDepth = depth(root.right);
		ans = Math.max(ans, leftDepth + rightDepth + 1);
		return Math.max(leftDepth, rightDepth) + 1;
	}

}
