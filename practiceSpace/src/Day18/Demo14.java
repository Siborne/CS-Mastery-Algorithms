package Day18;

import java.util.Scanner;

public class Demo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		reader.nextLine();
		char[] chs = reader.nextLine().toCharArray();
		StringBuilder sb = new StringBuilder();
		while(n-->0) {
			int x = reader.nextInt();
			sb.append(chs[x-1]);
		}
		System.out.println(sb.toString());
		
	}

}
