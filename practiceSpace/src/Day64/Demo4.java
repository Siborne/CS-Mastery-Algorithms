package Day64;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		char[] target = "codeforces".toCharArray();
		int t = reader.nextInt();
		reader.nextLine();
		while(t-->0) {
			char[] chs = reader.nextLine().toCharArray();
			int ans = 0;
			for(int i = 0;i<chs.length;i++) {
				if(chs[i]!=target[i]) {
					ans++;
				}
			}
			System.out.println(ans);
		}
		
		reader.close();
	}
	
}
