package sjjg_qb;

import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int m = reader.nextInt();
		m = m % n;
		int[] arr = new int[n];
		for (int i = m,count = 0; count < n; i = (i + 1) % n,count++) {
			arr[i]=reader.nextInt();
		}
		StringBuilder sb = new StringBuilder();
		for(int a:arr) {
			sb.append(a).append(" ");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb.toString());
		reader.close();
	}

}
