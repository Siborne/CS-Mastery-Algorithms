package Day59;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int ans = 0;
		int a = 0;
		while(n-->0) {
			int x = reader.nextInt();
			if(x==-1) {
				if(a>0) {
					a--;
				}else {
					ans++;
				}
			}else {
				a += x;
			}
		}
		System.out.println(ans);
		reader.close();
	}
	
}
