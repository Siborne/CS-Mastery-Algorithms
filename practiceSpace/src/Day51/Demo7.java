package Day51;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int h = reader.nextInt();
		int ans = 0;
		for(int i = 0;i<n;i++) {
			int x = reader.nextInt();
			if(x>h) {
				ans++;
			}
			ans++;
		}
		System.out.println(ans);
		reader.close();
	}
	
}
