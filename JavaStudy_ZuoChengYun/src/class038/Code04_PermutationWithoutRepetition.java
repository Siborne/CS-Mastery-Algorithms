package class038;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Code04_PermutationWithoutRepetition {

	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		f(nums, 0, ans);
		return ans;
	}

	private static void f(int[] nums, int i, List<List<Integer>> ans) {
		if (i == nums.length) {
			List<Integer> cur = new ArrayList<>();
			for (int num : nums) {
				cur.add(num);
			}
			ans.add(cur);
		} else {
			Set<Integer> set = new HashSet<>();
			for (int j = i; j < nums.length; j++) {
				if (!set.contains(nums[j])) {
					set.add(nums[j]);
					swap(nums, i, j);
					f(nums, i + 1, ans);
					swap(nums, i, j);
				}
			}
		}
	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
