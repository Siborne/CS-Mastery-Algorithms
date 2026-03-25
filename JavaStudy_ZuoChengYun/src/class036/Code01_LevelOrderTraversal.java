package class036;

import java.util.ArrayList;
import java.util.List;

public class Code01_LevelOrderTraversal {
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;
	}

	private static int MAXN = 2001;
	private static TreeNode[] queue = new TreeNode[MAXN];
	private static int l, r;

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<>();
		if (root != null) {
			l = 0;
			r = 0;
			queue[r++] = root;
			while (l < r) {
				int size = r - l;
				List<Integer> list = new ArrayList<>();
				for (int i = 0; i < size; i++) {
					TreeNode cur = queue[l++];
					list.add(cur.val);
					if (cur.left != null) {
						queue[r++] = cur.left;
					}
					if (cur.right != null) {
						queue[r++] = cur.right;
					}
				}
				ans.add(list);
			}
		}

		return ans;
	}

}
