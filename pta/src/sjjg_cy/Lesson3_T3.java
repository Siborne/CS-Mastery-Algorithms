package sjjg_cy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Lesson3_T3 {

	private static class TreeNode {
		private int val;
		private TreeNode left;
		private TreeNode right;

		private TreeNode(int val) {
			this.val = val;
		}

	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		reader.nextLine();

		List<Integer> pushOrder = new ArrayList<>();
		List<Integer> popOrder = new ArrayList<>();

		Stack<TreeNode> stack = new Stack<>();

		for (int i = 0; i < 2 * n; i++) {
			String line = reader.nextLine().trim();
			String[] parts = line.split("\\s+");
			if (parts[0].equals("Push")) {
				int val = Integer.parseInt(parts[1]);
				TreeNode node = new TreeNode(val);
				pushOrder.add(val);
				stack.push(node);
			} else {
				TreeNode node = stack.pop();
				popOrder.add(node.val);
			}
		}

		TreeNode root = rebuildTree(pushOrder, popOrder);

		List<Integer> postorder = new ArrayList<>();
		postorderTraversal(root, postorder);

		for (int i = 0; i < postorder.size(); i++) {
			if (i > 0) {
				System.out.print(" ");
			}
			System.out.print(postorder.get(i));
		}
		System.out.println();

		reader.close();
	}

	private static TreeNode rebuildTree(List<Integer> preOrder, List<Integer> inorder) {
		if (preOrder.isEmpty() || inorder.isEmpty()) {
			return null;
		}

		int rootVal = preOrder.get(0);
		TreeNode root = new TreeNode(rootVal);

		int rootIndex = inorder.indexOf(rootVal);

		List<Integer> leftInorder = inorder.subList(0, rootIndex);
		List<Integer> rightInorder = inorder.subList(rootIndex + 1, inorder.size());

		List<Integer> rightPreorder = new ArrayList<>();
		List<Integer> leftPreorder = new ArrayList<>();

		for (int i = 1; i < preOrder.size(); i++) {
			int val = preOrder.get(i);
			if (rightInorder.contains(val)) {
				rightPreorder.add(val);
			} else {
				leftPreorder.add(val);
			}
		}

		root.left = rebuildTree(leftPreorder, leftInorder);
		root.right = rebuildTree(rightPreorder, rightInorder);

		return root;
	}

	private static void postorderTraversal(TreeNode root, List<Integer> result) {
		if (root == null) {
			return;
		}
		postorderTraversal(root.left, result);
		postorderTraversal(root.right, result);
		result.add(root.val);
	}

}
