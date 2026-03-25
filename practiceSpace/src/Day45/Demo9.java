package Day45;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		while(t-->0) {
			int n = reader.nextInt();
			String str = reader.next();
			StringBuilder a = new StringBuilder();
			StringBuilder b = new StringBuilder();
			
			for(int i = 0;i<2*n;i++) {
				if((i&1)==1) {
					a.append('A');
					b.append('B');
				}else {
					a.append('B');
					b.append('A');
				}
			}
			
			int diffA = calc(str,a.toString());
			int diffB = calc(str,b.toString());
			
			System.out.println(Math.min(diffA, diffB));
		}
		reader.close();
	}
	
	private static int calc(String s,String t) {
		int ans = 0;
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)!=t.charAt(i)) {
				ans++;
			}
		}
		return ans/2;
	}

}
