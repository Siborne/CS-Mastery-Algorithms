package Day47;

import java.util.Scanner;

public class Demo1 {

	private static int n ;
	private static int[] a;
	private static char[] s = {' ','+','-'};
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		n = reader.nextInt();
		a = new int[n+2];
		a[1] = 1;
		dfs(2);
		reader.close();
	}
	
	private static void dfs(int k) {
		// TODO Auto-generated method stub
		if(k>n) {
			if(check()) {
				StringBuilder sb = new StringBuilder();
				sb.append("1");
				for(int i = 2;i<=n;i++) {
					sb.append(s[a[i]]).append(i);
				}
				System.out.println(sb.toString());
			}
			return;
		}
		
		for(int i = 0;i<=2;i++) {
			a[k] = i;
			dfs(k+1);
			a[k] = 0;
		}
		
	}
	
	private static boolean check() {
		int ans = 0;
		int num = 1;
		int sign = 1;
		
		for(int i = 2;i<=n;i++) {
			if(a[i]==0) {
				num = num *10+i;
			}else {
				ans += sign*num;
				sign = (a[i]==1)?1:-1;
				num = i;
			}
		}
		ans += sign * num;
		
		return ans == 0;
	}
	
}
