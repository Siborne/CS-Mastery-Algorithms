package Day139;

public class Demo1 {

	public int[] plusOne(int[] digits) {
		int n = digits.length;
		digits[n - 1]++;
		if (digits[n - 1] < 10) {
			return digits;
		} else {
			int carry = 0;
			for (int i = n - 1; i >= 0; i--) {
				digits[i] += carry;
				carry = digits[i] / 10;
				digits[i] %= 10;
			}

			if (carry != 0) {
				int[] ans = new int[n + 1];
				ans[0] = carry;
				for (int i = 1; i < n; i++) {
					ans[i] = digits[i - 1];
				}
				return ans;
			} else {
				return digits;
			}

		}
	}

}
