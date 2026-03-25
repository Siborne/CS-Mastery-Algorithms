package class037;

import java.util.ArrayList;
import java.util.List;

public class Code03_PathSumII {

	// 不提交这个类
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;
	}

	public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		List<List<Integer>> ans = new ArrayList<>();
		if (root != null) {
			List<Integer> path = new ArrayList<>();
			f(root, targetSum, 0, path, ans);
		}
		return ans;
	}

	private void f(TreeNode cur, int targetSum, int sum, List<Integer> path, List<List<Integer>> ans) {
		if (cur.left == null && cur.right == null) {
			if (cur.val + sum == targetSum) {
				path.add(cur.val);
				List<Integer> copy = new ArrayList<>();
				copy.addAll(path);
				ans.add(copy);
				path.remove(path.size() - 1);
			} 
		}else {
			path.add(cur.val);
			if (cur.left != null) {
				f(cur.left, targetSum, sum + cur.val, path, ans);
			}
			if (cur.right != null) {
				f(cur.right, targetSum, sum + cur.val, path, ans);
			}
			path.remove(path.size() - 1);
		}

	}

}
