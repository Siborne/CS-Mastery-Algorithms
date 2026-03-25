package class036;

import java.util.HashMap;
import java.util.Map;

public class Code07_PreorderInorderBuildBinaryTree {
	// 不提交这个类
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;

		public TreeNode(int v) {
			val = v;
		}
	}

	class Solution {

		public TreeNode buildTree(int[] preorder, int[] inorder) {
			if (preorder == null || inorder == null || preorder.length != inorder.length) {
				return null;
			}
			Map<Integer, Integer> map = new HashMap<>();
			for (int i = 0; i < inorder.length; i++) {
				map.put(inorder[i], i);
			}
			return f(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);
		}

		private TreeNode f(int[] preorder, int l1, int r1, int[] inorder, int l2, int r2,
				Map<Integer, Integer> map) {
			if (l1 > r1) {
				return null;
			}
			TreeNode head = new TreeNode(preorder[l1]);
			if (l1 == r1) {
				return head;
			}
			int k = map.get(preorder[l1]);
			head.left = f(preorder, l1 + 1, l1 + k - l2, inorder, l2, k - 1, map);
			head.right = f(preorder, l1 + k - l2 + 1, r1, inorder, k + 1, r2, map);
			return head;
		}

	}
}
