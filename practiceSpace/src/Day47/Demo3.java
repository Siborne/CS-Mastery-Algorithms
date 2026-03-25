package Day47;

import java.util.Scanner;

public class Demo3 {

	private static int p;
	private static int[] pos = new int[10];
	private static boolean flag;

	private static String str;
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		while(t-->0) {
			str =reader.next();
			char[] chs = str.toCharArray();
			p = 0;
			for(int i = 0;i<str.length();i++) {
				if(chs[i]=='*') {
					pos[++p]=i;
				}
			}
			
			flag = false;
			if(p==0) {
				if(isPrime(Integer.parseInt(str))) {
					System.out.println(str);
				}else {
					System.out.println(-1);
				}
			}else {
				dfs(1,chs);
				if(!flag) {
					System.out.println(-1);
				}
			}
		}
		
		reader.close();
	}
	
	private static void dfs(int t,char[] chs) {
		if(flag) {
			return;
		}
		
		if(t>p) {
			String s = new String(chs);
			if(isPrime(Integer.parseInt(s))) {
				System.out.println(s);
				flag = true;
			}
			return;
		}
		
		int c = pos[t];
		if(c==0) {
			for(int i = 1;i<=9;i++) {
				chs[c] = (char)('0'+i);
				dfs(t+1,chs);
				chs[c] = '*';
			}
		}else {
			for(int i = 0;i<=9;i++) {
				chs[c] = (char)('0'+i);
				dfs(t+1,chs);
				chs[c] = '*';
			}
		}
	}

	private static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
