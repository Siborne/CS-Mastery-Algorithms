package Day87;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Demo15_2 {

	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<>();

		if (root != null) {
			Stack<TreeNode> stack = new Stack<>();
			stack.push(root);
			while (!stack.isEmpty()) {
				TreeNode cur = stack.peek();
				if (cur.left != null && root != cur.left && root != cur.right) {
					stack.push(cur.left);
				} else if (cur.right != null && root != cur.right) {
					stack.push(cur.right);
				} else {
					ans.add(cur.val);
					root = stack.pop();
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
