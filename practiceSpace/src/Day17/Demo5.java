package Day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Demo5 {
	private static final int N = 5 + 1;
	private static final int MOD = (int) 1e9 + 7;

	private static int n, m, k;
	private static long ans = 0;
	private static long res = 0;
	private static Set<String> vis = new HashSet<>();
	private static Map<String,Integer>[] cnt = new HashMap[N];
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		n = reader.nextInt();
		m = reader.nextInt();
		k = reader.nextInt();
		
		for(int i = 0;i<N;i++) {
			cnt[i] = new HashMap<>();
		}
		reader.nextLine();
		for(int i = 1;i<=n;i++) {
			String s = reader.nextLine();
			for(int j = 0;j<=s.length()-k;j++) {
				String sn = s.substring(j,j+k);
				cnt[i].put(sn, cnt[i].getOrDefault(sn, 0)+1);
				vis.add(sn);
			}
		}
		
		for(String idx:vis) {
			List<Integer> vec = new ArrayList<>();
			for(int i = 1;i<=n;i++) {
				int num = cnt[i].getOrDefault(idx,0);
				if(num>0) {
					vec.add(num);
				}
			}
			if(vec.size()>=m) {
				res = 0;
				dfs(0,0,1,vec);
				ans=(ans+res)%MOD;
			}
			
		}
		
		System.out.println(ans);
		reader.close();
	}
	
	private static void dfs(int x,int num,long mul,List<Integer> vec) {
		if(num == m) {
			res = (res+mul)%MOD;
			return;
		}
		if(x==vec.size()) {
			return;
		}
		
		dfs(x+1,num,mul,vec);
		
		dfs(x+1,num+1,(mul*vec.get(x))%MOD,vec);
		
	}

}
