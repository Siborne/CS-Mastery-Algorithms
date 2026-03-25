package Day41;

public class Demo10 {

	private static int[] arr = new int[10];
	private static boolean[] visited = new boolean[10];
	private static int ans;

	public static void main(String[] args) {
		dfs(0);
		System.out.println(ans);
	}

	// 定义相邻关系
	private static final int[][] NEIGHBORS = {
			{ 0, 1 }, { 0, 4 }, { 0, 3 }, { 0, 5 },
			{ 1, 2 }, { 1, 4 }, { 1, 5 },{ 1, 6 }, 
			{ 2, 5 }, { 2, 6 }, 
			{ 3, 4 }, { 3, 7 }, { 3, 8 },
			{ 4, 5 }, { 4, 7 }, { 4, 8 }, { 4, 9 },
			{ 5, 6 }, { 5, 8 }, { 5, 9 }, 
			{ 6, 9 },
			{ 7, 8 }, { 8, 9 } 
			};

	private static void dfs(int step) {
		// TODO Auto-generated method stub
		if (step == arr.length) {
			for (int[] pair : NEIGHBORS) {
				int a = arr[pair[0]];
				int b = arr[pair[1]];
				if (Math.abs(a - b) == 1) {
					return;
				}
			}
			ans++;
			return;
		}

		for (int i = 0; i < 10; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[step] = i;
				dfs(step + 1);
				visited[i] = false;
			}
		}

	}

}
