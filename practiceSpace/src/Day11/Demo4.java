package Day11;

import java.util.Scanner;

public class Demo4 {
	
	public static long max = Long.MIN_VALUE;
	public static long min = Long.MAX_VALUE;
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		char[] c = reader.next().toCharArray();
		int k = reader.nextInt();
		StringBuilder sb = new StringBuilder();
		dfs(0,c,k,sb);
		System.out.print(max-min);
	}
	
	public static void dfs(int u,char[] c,int k,StringBuilder sb) {
		if(u==c.length) {
			if(k==0) {
				String[] s = sb.toString().split("\\+");
				long res = 0;
				for(String x:s) {
					res+=Long.valueOf(x);
				}
				max = Math.max(max, res);
				min = Math.min(min, res);
			
			}
			return;
		}
		
		sb.append(c[u]);
		dfs(u+1,c,k,sb);
		sb.deleteCharAt(sb.length()-1);
		
		if(k>0&&u<c.length-1) {
			sb.append(c[u]);
			sb.append("+");
			dfs(u+1,c,k-1,sb);
			sb.deleteCharAt(sb.length()-1);
			sb.deleteCharAt(sb.length()-1);
		}
		
	}
	
}
