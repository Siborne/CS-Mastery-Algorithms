package Day16;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		int l = reader.nextInt();
		int r = reader.nextInt();
		boolean[] f = new boolean[r + 1];

		for (int i = 1; i * i <= r; i++) {
			f[i * i] = true;
		}

		for (int i = l; i <= r; i++) {
			if (f[i]) {
				int k = 10;
				boolean found = false;

				for (int j = 1; j <= 5 && !found; j++) {
					int x = i % k;
					int y = i / k;
					
					if(i>0&&y>0&&f[x]&&f[y]) {
						System.out.println(i);
						found = true;
					}
					k*=10;
				}
			}
		}

	}

}
