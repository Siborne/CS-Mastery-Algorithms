package Day75;

import java.util.Scanner;

public class Demo44 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		reader.nextLine();
		while(t-->0) {
			char[] chs = reader.nextLine().toCharArray();
			int min = Integer.MAX_VALUE;
			for(int i = 0;i<chs.length;i++) {
				min = Math.min(min, chs[i]-'0');
			}
			System.out.println(min);
		}
		
		reader.close();
	}
	
}
