package class050;

import java.util.Arrays;

public class Code06_Heaters {
	public int findRadius(int[] houses, int[] heaters) {
		Arrays.sort(houses);
		Arrays.sort(heaters);
		int ans = 0;
		for (int i = 0, j = 0; i < houses.length; i++) {
			while (!best(houses, heaters, i, j)) {
				j++;
			}
			ans = Math.max(ans, Math.abs(heaters[j] - houses[i]));
		}
		return ans;
	}

	private static boolean best(int[] houses, int[] heaters, int i, int j) {
		return j == heaters.length - 1 || Math.abs(heaters[j] - houses[i]) < Math.abs(heaters[j + 1] - houses[i]);
	}
}
