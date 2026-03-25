package Day75;

import java.util.Scanner;

public class Demo39 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		while(t-->0) {
			int n = reader.nextInt();
			reader.nextLine();
			char[] chs = reader.nextLine().toCharArray();
			int max = 0;
			for(int i = 0;i<n;i++) {
				max = Math.max(max, chs[i]);
			}
			System.out.println(max-'a'+1);
		}
		
		reader.close();
	}
	
}
