package Day42;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] tree = new int[n];
		for (int i = 0; i < n; i++) {
			tree[i] = reader.nextInt();
		}
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(0);
		int level = 1;
		int max = tree[0];
		int ans = level;
		while (!queue.isEmpty()) {
			int size = queue.size();
			int temp = 0;
			for (int i = 0; i < size; i++) {
				int root = queue.poll();
				temp += tree[root];
				int left = (root << 1) + 1;
				if (left < n) {
					queue.offer(left);
				}
				int right = (root << 1) + 2;
				if (right < n) {
					queue.offer(right);
				}
			}
			if (temp > max) {
				max = temp;
				ans = level;
			}
			level++;
		}
		System.out.println(ans);
		reader.close();
	}
}
