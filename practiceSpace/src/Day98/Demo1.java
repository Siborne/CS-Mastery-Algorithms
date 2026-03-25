package Day98;

import java.util.Scanner;

public class Demo1 {
	
	private static int[] digits = new int[10];
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int M = reader.nextInt();
		int N = reader.nextInt();
		for(int i = M;i<=N;i++) {
			int temp = i;
			while(temp>0) {
				digits[temp%10]++;
				temp/=10;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int n:digits) {
			sb.append(n).append(" ");
		}
		System.out.println(sb.toString());
		reader.close();
	}
	
}
