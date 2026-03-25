package Day87;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Demo13 {

	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<>();
		if (root != null) {
			Stack<TreeNode> stack = new Stack<>();
			stack.push(root);
			while (!stack.isEmpty()) {
				root = stack.pop();
				ans.add(root.val);
				if (root.right != null) {
					stack.push(root.right);
				}
				if (root.left != null) {
					stack.push(root.left);
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
