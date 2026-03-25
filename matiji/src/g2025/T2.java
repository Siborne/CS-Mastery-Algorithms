package g2025;

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int f = Integer.MIN_VALUE;
		
		int g = Integer.MAX_VALUE;
		long ans = 0;
		for (int i = 0; i < n; i++) {
			int x = reader.nextInt();
			f = Math.max(f, x);
			g = Math.min(g, x);
			ans = f + g;
			
		}
		System.out.println(ans);
		reader.close();
	}

}
