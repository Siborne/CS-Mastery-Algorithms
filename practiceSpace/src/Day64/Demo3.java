package Day64;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		
		
		if(n>=0) {
			System.out.println(n);
			return;
		}
		int max = n;
		char[] chs = String.valueOf(n).substring(1).toCharArray();
		
		for(int i = chs.length-2;i<chs.length;i++) {
			StringBuilder sb = new StringBuilder();
			sb.append("-");
			for(int j = 0;j<chs.length;j++) {
				if(j==i) {
					continue;
				}
				sb.append(chs[j]);
			}
			max = Math.max(max, Integer.parseInt(sb.toString()));
		}
		System.out.println(max);
		reader.close();
	}
	
}
