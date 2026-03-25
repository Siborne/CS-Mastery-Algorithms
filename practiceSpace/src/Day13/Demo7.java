package Day13;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo7 {
	public static BigInteger BIG_MOD = new BigInteger("1000000007");
	public static BigInteger BIG_TWO = new BigInteger("2");
	public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	public static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int t = Integer.parseInt(st.nextToken());
		
		while(t-->0) {
			st = new StringTokenizer(reader.readLine());
			int n = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(reader.readLine());
			int[] arr = new int[n];
			int odd = 0;
			for(int i = 0;i<n;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				if((arr[i]&1)==1) {
					odd++;
				}
			}
			
			if((odd&1)==1) {
				writer.println(0);
				continue;
			}
			
			if(odd == 0) {
				writer.println(BIG_TWO.pow(n).mod(BIG_MOD));
			}else {
				writer.println(BIG_TWO.pow(n-1).mod(BIG_MOD));
			}
			
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
