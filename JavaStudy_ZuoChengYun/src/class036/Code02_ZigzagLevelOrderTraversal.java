package class036;

import java.util.ArrayList;
import java.util.List;

public class Code02_ZigzagLevelOrderTraversal {

	// 不提交这个类
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;
	}

	private static int MAXN = 2001;
	private static TreeNode[] queue = new TreeNode[MAXN];
	private static int l, r;

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<>();

		if (root != null) {
			l = r = 0;
			queue[r++] = root;
			boolean reverse = false;
			while (l < r) {
				int size = r - l;
				List<Integer> list = new ArrayList<>();
				for (int i = reverse ? r - 1 : l, j = reverse ? -1 : 1, k = 0; k < size; i += j, k++) {
					TreeNode cur = queue[i];
					list.add(cur.val);
				}

				for (int i = 0; i < size; i++) {
					TreeNode cur = queue[l++];
					if (cur.left != null) {
						queue[r++] = cur.left;
					}
					if (cur.right != null) {
						queue[r++] = cur.right;
					}
				}

				ans.add(list);
				reverse = !reverse;
			}
		}

		return ans;
	}
}
