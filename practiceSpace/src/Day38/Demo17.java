package Day38;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo17 {
	
	private static List<Integer> squares = new ArrayList<>();
	private static int n = 2019;
	private static long ans;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		for(int i = 1;i*i<=n;i++) {
			squares.add(i*i);
		}
		dfs(0,0);
		System.out.println(ans);
		reader.close();
	}
	
	private static void dfs(int k,int sum) {
		if(sum == n) {
			ans++;
			return;
		}
		
		if(k>squares.size()||sum>n) {
			return;
		}
		
		dfs(k+1,sum+squares.get(k));
		
		dfs(k+1, sum);
	}

}
