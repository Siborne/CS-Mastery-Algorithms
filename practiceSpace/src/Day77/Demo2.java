package Day77;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			if(n%2==0) {
				System.out.println(n/2);
			}else {
				System.out.println(n/2+1);
			}
		}

		reader.close();
	}

}
