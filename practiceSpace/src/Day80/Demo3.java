package Day80;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int odd = 0;
			int doub = 0;
			for(int i = 0;i<n;i++) {
				int x = reader.nextInt();
				if((x&1)==1) {
					odd+=x;
				}else {
					doub+=x;
				}
			}
			if(doub>odd){
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		reader.close();
	}

}
