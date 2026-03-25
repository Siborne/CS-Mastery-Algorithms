package Day48;

public class Demo5 {

	private static int[] arr = new int[6];
	private static boolean[] visited = new boolean[10];
	private static boolean flag = false;

	public static void main(String[] args) {
		dfs(0);
	}

	private static void dfs(int step) {
		if (flag) {
			return;
		}
		if (step == arr.length) {
			if ((arr[0] * 100 + arr[1] * 10 + arr[2]) * (arr[0] * 100 + arr[1] * 10 + arr[2]) == arr[0] * 100000
					+ arr[3] * 10000 + arr[4] * 1000 + arr[5] * 100 + arr[3] * 10 + arr[1]) {
				System.out.println(arr[0] * 100 + arr[1] * 10 + arr[2]);
				flag = true;
			}
			return;
		}

		for (int i = 0; i < 10; i++) {
			if (step == 0 && i == 0) continue;
			if(!visited[i]) {
				visited[i] = true;
				arr[step] = i;
				dfs(step + 1);
				visited[i] = false;
			}
		}

	}

}
