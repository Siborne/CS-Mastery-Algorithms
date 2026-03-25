package Day40;

public class Demo3 {

	private static int ans;
	private static int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dfs(1);
		System.out.println(ans);
	}

	private static void dfs(int step) {
		if (step == arr.length) {
			int r1 = arr[0] + arr[1] + arr[2] + arr[3];
			int r2 = arr[4] + arr[5] + arr[6] + arr[7];
			int r3 = arr[8] + arr[9] + arr[10] + arr[11];
			int r4 = arr[12] + arr[13] + arr[14] + arr[15];

			int c1 = arr[0]+arr[4]+arr[8]+arr[12];
			int c2 = arr[1]+arr[5]+arr[9]+arr[13];
			int c3 = arr[2]+arr[6]+arr[10]+arr[14];
			int c4 = arr[3]+arr[7]+arr[11]+arr[15];

			int d1 = arr[0] + arr[5] + arr[10] + arr[15];
			int d2 = arr[3] + arr[6] + arr[9] + arr[12];

			if (r1 == r2 && r2 == r3 && r3 == r4 && r4 == c1 && c1 == c2 && c2 == c3 && c3 == c4 && c4 == d1
					&& d1 == d2) {
				ans++;
				return;
			}
		}
		
		for (int i = step; i < arr.length; i++) {
			swap(i, step);
			dfs(step + 1);
			swap(i, step);
		}
	}

	private static void swap(int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

}
