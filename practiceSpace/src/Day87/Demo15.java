package Day87;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Day87.Demo14.TreeNode;

public class Demo15 {

	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<>();

		if (root != null) {
			Stack<TreeNode> stack = new Stack<>();
			Stack<TreeNode> collect = new Stack<>();
			stack.push(root);
			while(!stack.isEmpty()) {
				root = stack.pop();
				collect.push(root);
				if(root.left!=null) {
					stack.push(root.left);
				}
				if(root.right!=null) {
					stack.push(root.right);
				}
			}
			while(!collect.isEmpty()) {
				ans.add(collect.pop().val);
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
