package Day80;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int a = reader.nextInt();
			int b = reader.nextInt();
			if(a==b) {
				System.out.println("0");
				continue;
			}
			int c = b-a;
			if(c<0) {
				c = -c;
				if(c%2==1) {
					System.out.println("2");
				}else {
					System.out.println("1");
				}
			}else {
				if(c%2==1) {
					System.out.println("1");
				}else {
					System.out.println("2");
				}
			}
		}

		reader.close();
	}

}
