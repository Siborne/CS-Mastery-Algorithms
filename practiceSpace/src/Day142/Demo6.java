package Day142;

import java.util.ArrayList;
import java.util.List;

public class Demo6 {

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

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<>();
		dfs(root, ans);
		return ans;
	}

	private static void dfs(TreeNode root, List<Integer> list) {
		if (root == null) {
			return;
		}
		dfs(root.left, list);
		list.add(root.val);
		dfs(root.right, list);
	}

}
