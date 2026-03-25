package Day46;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Demo6 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static Plane[] arr;
	private static boolean[] bk;
	private static int n;
	private static class Plane {
		int t;
		int d;
		int l;

		private Plane(int t, int d, int l) {
			this.t = t;
			this.d = d;
			this.l = l;
		}

	}

	public static void main(String[] args) throws IOException {
		int t = Integer.parseInt(reader.readLine());
		while (t-- > 0) {
			n = Integer.parseInt(reader.readLine());
			arr = new Plane[n+1];
			bk = new boolean[n+1];
			for(int i = 1;i<=n;i++) {
				StringTokenizer st = new StringTokenizer(reader.readLine());
				int t_i = Integer.parseInt(st.nextToken());
				int d_i = Integer.parseInt(st.nextToken());
				int l_i = Integer.parseInt(st.nextToken());
				arr[i] = new Plane(t_i, d_i, l_i);
			}
			
//			Arrays.fill(bk, false);
			
			if(dfs(1,0)) {
				writer.println("YES");
			}else {
				writer.println("NO");
			}
			
		}

		writer.flush();
		writer.close();
		reader.close();
	}
	
	private static boolean dfs(int dep,int tim) {
		if(dep>n) {
			return true;
		}
		
		for(int i = 1;i<=n;i++) {
			if(bk[i]) {
				continue;
			}
			Plane p = arr[i];
			
			if(p.t+p.d<tim) {
				continue;
			}
			
			bk[i] = true;
			int nextTime = Math.max(tim, p.t) + p.l;
			if(dfs(dep+1,nextTime)) {
//				bk[i] = false;
				return true;
			}
			bk[i] = false;
			
		}
		return false;
	}

}
