package Day78;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int odd = 0;
			for(int i = 0;i<n*2;i++) {
				int x = reader.nextInt();
				if(x%2==1) {
					odd++;
				}
			}
			if(odd!=n) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
		}

		reader.close();
	}

}
