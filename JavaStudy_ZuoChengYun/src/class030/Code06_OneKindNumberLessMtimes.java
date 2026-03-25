package class030;

public class Code06_OneKindNumberLessMtimes {

	public int singleNumber(int[] nums) {
		return find(nums, 3);
	}

	private static int find(int[] arr, int m) {
		int[] count = new int[32];
		for (int num : arr) {
			for (int i = 0; i < 32; i++) {
				count[i] += (num >> i) & 1;
			}
		}
		int ans = 0;
		for (int i = 0; i < 32; i++) {
			if (count[i] % m != 0) {
				ans |= 1 << i;
			}
		}
		return ans;
	}

}
