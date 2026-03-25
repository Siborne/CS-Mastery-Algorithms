package Day43;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int L = reader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
		}
		int ans = bfs(arr, n, L);
		System.out.println(ans);
		reader.close();
	}

	private static int bfs(int[] arr, int n, int L) {
		if (L == 1) {
			return 0;
		}
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				set.add(arr[i] + arr[j]);
			}
		}
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		boolean[] visited = new boolean[L + 1];
		visited[1] = true;
		int[] steps = new int[L + 1];
		steps[1] = 0;
		while (!queue.isEmpty()) {
			int index = queue.poll();
			for (int sum : set) {
				int next = (index+sum-1)%L+1;
				if(next==L) {
					return steps[index]+1;
				}
				if(!visited[next]) {
					visited[next] = true;
					steps[next] = steps[index] + 1;
					queue.add(next);
				}
			}
		}
		return -1;
	}

}
