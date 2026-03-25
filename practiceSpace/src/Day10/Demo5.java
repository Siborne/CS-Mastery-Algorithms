package Day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo5 {
	public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	public static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(reader.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int sum = 0;
		int l = 0;
		int r = 0;
		int max = n + 1;
		while (r < n) {
			sum += arr[r];
			while (sum >= s) {
				max = Math.min(max, r - l + 1);
				sum -= arr[l];
				l++;
			}
			r++;
		}
		if (max == n + 1) {
			max = 0;
		}
		System.out.println(max);
	}

}
