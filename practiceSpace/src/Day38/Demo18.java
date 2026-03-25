package Day38;

import java.util.ArrayList;
import java.util.List;

public class Demo18 {
	
	private static List<Integer> list = new ArrayList<>();
	private static int n = 2019;
	private static long ans = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i*i<=n;i++) {
			list.add(i*i);
		}
		dfs(0,0);
		System.out.println(ans);
	}
	
	private static void dfs(int index,int sum) {
		if(sum==n) {
			ans++;
			return;
		}
		if(index>=list.size()||sum>n) {
			return;
		}
		dfs(index+1,sum+list.get(index));
		dfs(index+1, sum);
	}
	

}
