package class036;

public class Code06_LevelorderSerializeAndDeserialize {

	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;

		public TreeNode(int v) {
			val = v;
		}
	}

	public class Codec {

		private static int MAXN = 10001;

		private static TreeNode[] queue = new TreeNode[MAXN];

		private static int l, r;

		// Encodes a tree to a single string.
		public String serialize(TreeNode root) {
			StringBuilder builder = new StringBuilder();
			if (root != null) {
				builder.append(root.val + ",");
				l = r = 0;
				queue[r++] = root;
				while (l < r) {
					root = queue[l++];
					if (root.left != null) {
						builder.append(root.left.val + ",");
						queue[r++] = root.left;
					} else {
						builder.append("#,");
					}
					if (root.right != null) {
						builder.append(root.right.val + ",");
						queue[r++] = root.right;
					} else {
						builder.append("#,");
					}
				}
			}
			return builder.toString();
		}

		// Decodes your encoded data to tree.
		public TreeNode deserialize(String data) {
			if (data.equals("")) {
				return null;
			}
			String[] nodes = data.split("\\,");
			int index = 0;
			TreeNode root = generate(nodes[index++]);
			l = r = 0;
			queue[r++] = root;
			while(l<r) {
				TreeNode cur = queue[l++];
				cur.left = generate(nodes[index++]);
				cur.right = generate(nodes[index++]);
				if(cur.left!=null) {
					queue[r++] = cur.left;
				}
				if(cur.right!=null) {
					queue[r++] = cur.right;
				}
			}
			
			return root;
		}

		private TreeNode generate(String val) {
			return val.equals("#") ? null : new TreeNode(Integer.valueOf(val));
		}
	}

}
