package sjjg_cy;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson3_T1 {

	private static class TreeNode {
		char val;
		int left;
		int right;

		private TreeNode(char val, int left, int right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n1 = reader.nextInt();
		TreeNode[] tree1 = new TreeNode[n1];
		boolean[] hasParent = new boolean[n1];

		Arrays.fill(hasParent, false);

		for (int i = 0; i < n1; i++) {
			char val = reader.next().charAt(0);
			String leftStr = reader.next();
			String rightStr = reader.next();
			int left = leftStr.equals("-") ? -1 : Integer.parseInt(leftStr);
			int right = rightStr.equals("-") ? -1 : Integer.parseInt(rightStr);

			tree1[i] = new TreeNode(val, left, right);

			if (left != -1) {
				hasParent[left] = true;
			}
			if (right != -1) {
				hasParent[right] = true;
			}
		}

		int root1 = -1;
		for (int i = 0; i < n1; i++) {
			if (!hasParent[i]) {
				root1 = i;
				break;
			}
		}

		int n2 = reader.nextInt();
		TreeNode[] tree2 = new TreeNode[n2];
		hasParent = new boolean[n2];
		Arrays.fill(hasParent, false);

		for (int i = 0; i < n2; i++) {
			char val = reader.next().charAt(0);
			String leftStr = reader.next();
			String rightStr = reader.next();
			int left = leftStr.equals("-") ? -1 : Integer.parseInt(leftStr);
			int right = rightStr.equals("-") ? -1 : Integer.parseInt(rightStr);

			tree2[i] = new TreeNode(val, left, right);

			if (left != -1) {
				hasParent[left] = true;
			}
			if (right != -1) {
				hasParent[right] = true;
			}
		}

		int root2 = -1;
		for (int i = 0; i < n2; i++) {
			if (!hasParent[i]) {
				root2 = i;
				break;
			}
		}

		if (isIsomorphic(tree1, root1, tree2, root2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		reader.close();
	}

	private static boolean isIsomorphic(TreeNode[] tree1, int root1, TreeNode[] tree2, int root2) {
		if (root1 == -1 && root2 == -1) {
			return true;
		}
		if (root1 == -1 || root2 == -1) {
			return false;
		}

		if (tree1[root1].val != tree2[root2].val) {
			return false;
		}

		boolean noSwap = isIsomorphic(tree1, tree1[root1].left, tree2, tree2[root2].left)
				&& isIsomorphic(tree1, tree1[root1].right, tree2, tree2[root2].right);

		boolean swap = isIsomorphic(tree1, tree1[root1].left, tree2, tree2[root2].right)
				&& isIsomorphic(tree1, tree1[root1].right, tree2, tree2[root2].left);

		return noSwap || swap;
	}

}
