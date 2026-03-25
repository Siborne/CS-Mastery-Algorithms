package Day78;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int a = reader.nextInt();
			int b = reader.nextInt();
			if(n%2==0) {
				if(a*2>b) {
					System.out.println(n/2*b);
				}else {
					System.out.println(n*a);
				}
				
			}else {
				if(a*2>b) {
					System.out.println(n/2*b+a);
				}else {
					System.out.println(n*a);
				}
			}
		}

		reader.close();
	}

}
