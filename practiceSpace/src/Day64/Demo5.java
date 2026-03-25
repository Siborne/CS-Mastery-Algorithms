package Day64;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int[] kll = new int[4];
		for(int i = 0;i<4;i++) {
			kll[i] = reader.nextInt();
		}
		reader.nextLine();
		char[] chs = reader.nextLine().toCharArray();
		long ans = 0;
		for(char ch:chs) {
			ans+=kll[ch-'1'];
		}
		System.out.println(ans);
		reader.close();
	}
	
}
