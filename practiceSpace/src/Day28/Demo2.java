package Day28;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		for (int i = (int) 1e7; i > 0; i--) {
			if(check(i)) {
				System.out.println(i);
				break;
			}
		}
		reader.close();
	}

	private static boolean check(int x) {
		String s = x + "";
		int l = s.length();
		int[] dp = new int[l];
		
		for(int i = 0;i<l;i++) {
			dp[i] = s.charAt(i) - '0';
		}
		
		int sum = 0;
		
		for(int i = l;sum<x;i++) {
			sum = Arrays.stream(dp).sum();
			dp[i%l] = sum;
		}
		
		return sum == x;
	}
	
}
