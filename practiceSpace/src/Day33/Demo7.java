package Day33;

import java.util.LinkedList;
import java.util.List;

public class Demo7 {

	private static List<Integer> path = new LinkedList<>();
	private static List<List<Integer>> res = new LinkedList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
	
	private static void solve() {
		int[] nums = new int[16];
		
		for(int i = 0;i<nums.length;i++) {
			nums[i] = i+1;
		}
		
		blackTracking(nums, 0, 0, 0, 0);
		
		for(List<Integer> list: res) {
			if(list.contains(1)) {
				for(Integer item : list) {
					System.out.print(item + " ");
				}
			}
		}
	}
	
	private static void blackTracking(int[] nums,int sum,int sumOf2,int sumOf3,int startIndex) {
		if(path.size()==8&&sum==136/2&&sumOf2==1496/2&&sumOf3 == 18496/2) {
			res.add(new LinkedList<>(path));
			return;
		}

		for(int i = startIndex;i<nums.length;i++) {
			int cur = nums[i];
			path.add(cur);
			
			blackTracking(nums, sum+cur, sumOf2 + cur*cur, sumOf3+cur*cur*cur, i+1);
			
			path.remove(path.size()-1);
		}
		
	}
	
	
}
