package Day38;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		solve();
	}

	private static final int N = 1000010;
	private static int[] pre = new int[N];
	private static int cnt;
	private static int m, n, k;

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static void solve() throws IOException {
		StringTokenizer st = new StringTokenizer(reader.readLine());
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(reader.readLine());
		k = Integer.parseInt(st.nextToken());
		cnt = n * m;
		for(int i = 1;i<=n*m;i++) {
			pre[i] = i;
		}
		
		while(k-->0) {
			st = new StringTokenizer(reader.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			union(a,b);
		}
		System.out.println(cnt);
	}
	
	private static void union(int a,int b) {
		int roota = find(a);
		int rootb = find(b);
		if(roota!=rootb) {
			pre[roota]=rootb;
			cnt--;
		}
		return;
	}
	
	private static int find(int x) {
		if(x==pre[x]) {
			return x;
		}else {
			return find(pre[x]);
		}
	}

}
