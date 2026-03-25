package class036;

public class Code05_PreorderSerializeAndDeserialize {
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;

		public TreeNode(int v) {
			val = v;
		}
	}

	public class Codec {

		// Encodes a tree to a single string.
		public String serialize(TreeNode root) {
			StringBuilder builder = new StringBuilder();
			f(root, builder);
			return builder.toString();
		}

		private void f(TreeNode root, StringBuilder builder) {
			if (root == null) {
				builder.append("#,");
			} else {
				builder.append(root.val + ",");
				f(root.left, builder);
				f(root.right, builder);
			}
		}

		private static int cnt;

		// Decodes your encoded data to tree.
		public TreeNode deserialize(String data) {
			String[] vals = data.split("\\,");
			cnt = 0;
			return g(vals);
		}

		private TreeNode g(String[] vals) {
			String cur = vals[cnt++];
			if(cur.equals("#")) {
				return null;
			}else {
				TreeNode head = new TreeNode(Integer.valueOf(cur));
				head.left = g(vals);
				head.right = g(vals);
				return head;
			}
		}
	}
}
