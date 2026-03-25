package Day120;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo2 {

	private static Map<Character, Node> tree = new HashMap<>();

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		reader.nextLine();
		char root = ' ';

		for (int i = 0; i < n; i++) {
			char[] input = reader.nextLine().toCharArray();
			char parent = input[0];
			char left = input[1];
			char right = input[2];

			if (i == 0) {
				root = parent;
			}
			tree.put(parent, new Node(parent, left, right));
		}

		preorder(root);
		reader.close();
	}

	private static void preorder(char root) {
		if (root == '*') {
			return;
		}
		System.out.print(root);
		Node node = tree.get(root);
		preorder(node.left);
		preorder(node.right);
	}

	private static class Node {
		char data;
		char left;
		char right;

		private Node(char data, char left, char right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}

	}

}
