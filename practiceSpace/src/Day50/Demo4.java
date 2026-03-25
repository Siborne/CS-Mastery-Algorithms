package Day50;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		reader.nextLine();
		char[] chs = reader.nextLine().toCharArray();
		int last = 0;
		int ans = 0;
		for(int i = 1;i<n;i++) {
			if(chs[last]==chs[i]) {
				ans++;
			}else {
				last = i;
			}
		}
		System.out.println(ans);
		
		reader.close();
	}
	
}
