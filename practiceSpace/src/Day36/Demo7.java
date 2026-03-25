package Day36;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		dfs(0,-1);
		System.out.println(ans);
		reader.close();
	}
	
	private static int ans;
	private static boolean[] visited = new boolean[11];
	
	private static void dfs(int len,int pre) {
		if(len == 10) {
			ans++;
			return;
		}
		
		for(int i = 1;i<=10;i++) {
			if(!visited[i] && Math.abs(i-pre) != 1) {
				visited[i] = true;
				dfs(len + 1,i);
				visited[i] = false;
			}
		}
	}
	
}
