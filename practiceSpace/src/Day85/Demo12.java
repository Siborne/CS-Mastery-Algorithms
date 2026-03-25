package Day85;

import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		char[] chs = reader.nextLine().toCharArray();
		int ans = 0;
		int l = 0;
		int r = chs.length-1;
		while(l<=r) {
			if(chs[l++]!=chs[r--]) {
				ans++;
			}
		}
		
		System.out.println(ans);
		reader.close();
	}

    
	
}
