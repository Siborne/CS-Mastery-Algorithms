package Day36;

import java.util.Scanner;

public class Demo10 {
	
	private static long ans;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		solve();
		reader.close();
	}

	private static void solve() {
		dfs(0);
		System.out.println(ans);
	}
	
	private static boolean[] visited = new boolean[10];
	private static int[] arr = new int[10];
	private static void dfs(int index) {
		
		if(index==arr.length) {
//			System.out.println(arr);
			if(arr[0]==0) {
				return;
			}
			long num = 0;
			for(int a : arr) {
				num = num*10+a;
			}
			long sqrt = (long)Math.sqrt(num);
			if(sqrt*sqrt==num) {
				ans = Math.max(ans, num);
			}
			return;
		}
		
		for(int i = 0;i<10;i++) {
			if(!visited[i]) {
				visited[i] = true;
				arr[index] = i;
				dfs(index+1);
				visited[i] = false;
			}
		}
	}
	
}
