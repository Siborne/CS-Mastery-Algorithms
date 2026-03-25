package Day11;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Demo5 {
	public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	public static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int t = Integer.parseInt(st.nextToken());
		long[] sum = new long[(int)1e6+1];
		for(int a = 1;a<100;a++) {
			for(int b = a+1;b<1000;b++) {
				for(int c=b+1;c<a+b;c++) {
					if(isTriangle(a, b, c)&&a*b*c<sum.length) {
						sum[a*b*c]++;
					}
				}
			}
		}
		for(int i = 1;i<sum.length;i++) {
			sum[i]+=sum[i-1];
		}
		while(t-->0) {
			st = new StringTokenizer(reader.readLine());
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			long res = sum[r] - sum[l-1];
			writer.println(res);
		}
		writer.flush();
		writer.close();
		reader.close();
	}
	
	public static boolean isTriangle(int a,int b,int c) {
		if((a+b>c)&&(a+c>b)&&(b+c>a)) {
			return true;
		}
		return false;
	}
}
