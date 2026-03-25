package Day41;

public class Demo4 {

	private static int[] arr = new int[] {  1, 2, 3, 4, 5, 6, 7, 8, 9 };
	private static int ans;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dfs(0);
		System.out.println(ans);
	}

	private static void dfs(int step) {
		if (step == arr.length) {
			double part1 = arr[0];
			if(arr[2]==0) {
				return;
			}
			double part2 = (arr[1] * 1.0) / arr[2];
			double part3 = (arr[3] * 100.0 + arr[4] * 10.0 + arr[5]) / (arr[6] * 100.0 + arr[7]*10.0 + arr[8]);
			if (Math.abs(part1 + part2 + part3 - 10) < 1e-9) {
				ans++;
			}
			return;
		}

		for (int i = step; i < arr.length; i++) {
			swap(step, i);
			dfs(step+1);
			swap(step, i);
		}
	}

	private static void swap(int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

}
