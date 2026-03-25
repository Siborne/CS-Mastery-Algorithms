package Day80;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int w = reader.nextInt();
			int h = reader.nextInt();
			int n = reader.nextInt();
			int count = 1;
			while(w%2==0) {
				w/=2;
				count*=2;
			}
			while(h%2==0) {
				h/=2;
				count*=2;
			}
			if(count>=n) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}

		reader.close();
	}

}
