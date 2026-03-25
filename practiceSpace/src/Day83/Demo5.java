package Day83;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int odd = 0;
			int doub = 0;
			for (int i = 0; i < n; i++) {
				int x = reader.nextInt();
				if ((x & 1) == 1) {
					odd++;
				} else {
					doub++;
				}
			}
			if((odd&1)==1) {
				System.out.println("YES");
			}else {
				if(odd==0) {
					System.out.println("NO");
				}else if(n-odd>0) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
		}

		reader.close();
	}

}
