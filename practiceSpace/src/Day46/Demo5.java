package Day46;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Demo5 {
	
	private static int n,a,b;
	private static int[] k;
	private static boolean[] visited;
	private static Queue<int[]> queue;
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		n = reader.nextInt();
		a = reader.nextInt();
		b = reader.nextInt();
		k = new int[n+1];
		for(int i = 1;i<=n;i++) {
			k[i] = reader.nextInt();
		}
		
		visited = new boolean[n+1];
		queue = new LinkedList<>();

		System.out.println(bfs());
		
		reader.close();
	}
	
	private static int bfs() {
		// TODO Auto-generated method stub
		queue.offer(new int[]{a,0});
		visited[a] = true;
		while(!queue.isEmpty()) {
			int[] cur = queue.poll();
			int x = cur[0];
			int y = cur[1];
			
			if(x==b) {
				return y;
			}
			
			int up = x +k[x];
			if(up>=1&&up<=n&&!visited[up]) {
				queue.offer(new int[] {up,y+1});
				visited[up] = true;
			}
			
			int down = x - k[x];
			if(down >= 1&&down<=n&&!visited[down]) {
				queue.offer(new int[] {down,y+1});
				visited[down] = true;
			}
		}
		return -1;
	}

}
