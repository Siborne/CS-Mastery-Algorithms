package Day85;

public class Demo1_2 {

	public static void main(String[] args) {
		System.out.println(solve(new int[] { 1, 2, 3, 1 }));
	}

	private static int solve(int[] arr) {
		int n = arr.length;
		if (arr.length == 1) {
			return 0;
		}
		if (arr[0] > arr[1]) {
			return 0;
		}
		if (arr[n - 1] > arr[n - 2]) {
			return n - 1;
		}
		int l = 1;
		int r = n - 2;
		int ans = -1;

		while (l <= r) {
			int mid = l + ((r - l) >> 1);
			if (arr[mid - 1] > arr[mid]) {
				r = mid - 1;
			} else if (arr[mid] < arr[mid + 1]) {
				l = mid + 1;
			} else {
				ans = mid;
				break;
			}
		}

		return ans;
	}

}
