package Day59;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int k = reader.nextInt();
		int time = 240-k;
		int ans = 0;
		for(int i = 1;i<=n;i++) {
			if(time-i*5<0) {
				break;
			}
			ans++;
			time-=i*5;
		}
		System.out.println(ans);
		reader.close();
	}
	
}
