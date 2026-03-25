package Day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo5 {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintWriter writer = new PrintWriter(System.out);
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int n = Integer.parseInt(reader.readLine());
		int A = 0;
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(reader.readLine());
		for (int i = 0; i < n; i++) {
			A += Integer.parseInt(st.nextToken());
		}
		
		System.out.println(A);
		
	}


}
