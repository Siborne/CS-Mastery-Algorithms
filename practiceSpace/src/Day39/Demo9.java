package Day39;

public class Demo9 {

	private static int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	private static int ans;

	public static void main(String[] args) {
		dfs(arr.length - 1);
		System.out.println(ans);
	}

	private static void dfs(int step) {
		if (step >= 1 && step <= 7) {
			check(step);
		}
		for (int i = step; i >= 0; i--) {
			swap(i, step);
			dfs(step - 1);
			swap(i, step);
		}
	}

	private static void check(int step) {
		StringBuilder sb1 = new StringBuilder();
		for (int i = 0; i <= step; i++) {
			sb1.append(arr[i]);
		}
		StringBuilder sb2 = new StringBuilder();
		for (int i = step + 1; i < arr.length; i++) {
			sb2.append(arr[i]);
		}
		int a = Integer.parseInt(sb1.toString());
		int b = Integer.parseInt(sb2.toString());
		int sum = a * b;
		if (sum > 987654321) {
			return;
		}
		if (!isOk(sum)) {
			return;
		}
		if (sum > ans) {
			ans = sum;
		}
	}

	private static boolean isOk(int num) {
		int[] nums = new int[10];
		while (num > 0) {
			if (nums[num % 10] != 0) {
				return false;
			}
			nums[num % 10]++;
			num /= 10;
		}
		return nums[0] == 0;
	}

	private static void swap(int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

}
