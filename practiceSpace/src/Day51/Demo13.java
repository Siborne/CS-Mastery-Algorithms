package Day51;

import java.util.Scanner;

public class Demo13 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int  n = reader.nextInt();
		int ans = 0;
		for(int i = 0;i<n;i++) {
			int x = reader.nextInt();
			int y = reader.nextInt();
			if(y-x>=2) {
				ans++;
			}
		}
		System.out.println(ans);
		reader.close();
	}
	
}
