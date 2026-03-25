package Day87;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Demo14 {

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<>();
		if (root != null) {
			Stack<TreeNode> stack = new Stack<>();
			while (!stack.isEmpty() || root != null) {
				if (root != null) {
					stack.push(root);
					root = root.left;
				} else {
					root = stack.pop();
					ans.add(root.val);
					root = root.right;
				}
			}
		}
		return ans;
	}

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
}
