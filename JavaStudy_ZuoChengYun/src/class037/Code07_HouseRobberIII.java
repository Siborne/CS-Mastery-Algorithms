package class037;

public class Code07_HouseRobberIII {

	// 不提交这个类
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;
	}

	public int rob(TreeNode root) {
		f(root);
		return Math.max(yes, no);
	}

	private static int yes;
	private static int no;

	private static void f(TreeNode root) {
		if(root == null) {
			yes = 0;
			no = 0;
		}else {
			int y = root.val;
			int n = 0;
			f(root.left);
			y += no;
			n += Math.max(yes,no);
			f(root.right);
			y += no;
			n += Math.max(yes, no);
			yes = y;
			no = n;
		}
	}
	
}
