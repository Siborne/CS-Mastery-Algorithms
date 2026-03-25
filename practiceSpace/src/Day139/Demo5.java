package Day139;

import java.util.Arrays;

public class Demo5 {

	public boolean canMakeArithmeticProgression(int[] arr) {
		Arrays.sort(arr);
		int n = arr.length;
		for (int i = 1; i < n - 1; i++) {
			if (arr[i] * 2 != arr[i + 1] + arr[i - 1]) {
				return false;
			}
		}
		return true;
	}

}
