package Day36;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		solve();
		reader.close();
	}

	private static void solve() {
		for (int i = 123; i < 987; i++) {
			int j = i * 2;
			int k = i * 3;
			if (j < 987 && k < 987 && check(i, j, k)) {
				System.out.print(i + " ");
			}
		}
	}

	private static boolean check(int i ,int j ,int k) {
		int[] nums = new int[10];
		while(i!=0) {
			if(nums[i%10]!=0) {
				return false;
			}
			nums[i%10]++;
			i/=10;
		}
		while(j!=0) {
			if(nums[j%10]!=0) {
				return false;
			}
			nums[j%10]++;
			j/=10;
		}
		while(k!=0) {
			if(nums[k%10]!=0) {
				return false;
			}
			nums[k%10]++;
			k/=10;
		}
		return nums[0]==0;
	}
	
}
