package sjjg_cy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Lesson3_T2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int[][] children = new int[n][2];
		boolean[] hasParent = new boolean[n];
		Arrays.fill(hasParent, false);

		for (int i = 0; i < n; i++) {
			String leftStr = reader.next();
			String rightStr = reader.next();
			if (leftStr.equals("-")) {
				children[i][0] = -1;
			} else {
				children[i][0] = Integer.parseInt(leftStr);
				hasParent[children[i][0]] = true;
			}

			if (rightStr.equals("-")) {
				children[i][1] = -1;
			} else {
				children[i][1] = Integer.parseInt(rightStr);
				hasParent[children[i][1]] = true;
			}
		}

		int root = -1;
		for (int i = 0; i < n; i++) {
			if (!hasParent[i]) {
				root = i;
				break;
			}
		}

		List<Integer> leaves = new ArrayList<>();
		Deque<Integer> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			int node = queue.poll();
			boolean isLeaf = true;
			if (children[node][0] != -1) {
				queue.offer(children[node][0]);
				isLeaf = false;
			}

			if (children[node][1] != -1) {
				queue.offer(children[node][1]);
				isLeaf = false;
			}
			if (isLeaf) {
				leaves.add(node);
			}
		}

		for (int i = 0; i < leaves.size(); i++) {
			if (i > 0) {
				System.out.print(" ");
			}
			System.out.print(leaves.get(i));
		}

		reader.close();
	}

}
