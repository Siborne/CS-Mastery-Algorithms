package Day14;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		char[] chs = reader.nextLine().toCharArray();
		long ans = 0;
		for(int i = 0;i<chs.length-1;i++) {
			if(chs[i]=='?') {
				ans++;
				i++;
			}else {
				if(chs[i]==chs[i+1]||chs[i+1]=='?') {
					ans++;
					i++;
				}
			}
		}
		System.out.println(ans);
		
		
		reader.close();
	}

}
