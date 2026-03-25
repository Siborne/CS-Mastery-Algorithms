package Day42;

import java.util.Scanner;

public class Demo16 {
	/*
	 * 要求最多能获得多少钟苹果，只需要知道mod之后有多少种苹果的值是<=t的，不需要对比原本的美味值
	 * 解题就是先生成所有mod的值的数组，然后记录所有<＝t的最大值，然后用滑动窗口即可求解
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int k = reader.nextInt();
		int t = reader.nextInt();
		int[] arr = new int[k];
		for(int i = 0;i<n;i++) {
			int x = reader.nextInt();
			arr[x%k]++;
		}
		
		int ans = 0;
		int temp = 0;
		for(int i = 0;i<=t;i++) {
			temp += arr[i];
		}
		ans = temp;
		
		for(int i = t+1;i<arr.length+k;i++) {
			temp = temp + arr[i%k] - arr[(i-t-1)%k];
			if(temp>ans) {
				ans = temp;
			}
		}
		
		System.out.println(ans);
		reader.close();
	}

}
