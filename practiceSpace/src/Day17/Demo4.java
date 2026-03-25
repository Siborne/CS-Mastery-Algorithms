package Day17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo4 {
	public static int n,m,x,y,b,M=0;
	public static List<Integer>[] list;
	public static int[] ans;
	public static boolean[] f;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		n = reader.nextInt();
		m = reader.nextInt();
		
		list = new ArrayList[1005];
		for (int i = 0; i < 1005; i++) {
            list[i] = new ArrayList<>();
        }
		ans = new int[1005];
		f = new boolean[1005];
		
		for(int i = 0;i<m;i++) {
			int x = reader.nextInt();
			int y = reader.nextInt();
			list[x].add(y);
			list[y].add(x);
			M = Math.max(Math.max(M, x), y);
		}
		
		x = reader.nextInt();
		y = reader.nextInt();
		reader.close();
		
		dfs(x);
		int res = 0;
		for(int i = 1;i<=M;i++) {
			if(ans[i]==b) {
				res++;
			}
		}
		System.out.println(res-1);
	}
	
	private static void dfs(int dq) {
		
		if(dq == y) {
			b++;
			for(int i = 1;i<=M;i++) {
				if(f[i]) {
					ans[i]++;
				}
			}
			return;
		}
		
		
		f[dq] = true;
		for(int to:list[dq]) {
			if(f[to]) {
				continue;
			}
			dfs(to);
		}
		f[dq] = false;
		
		
	}

}
