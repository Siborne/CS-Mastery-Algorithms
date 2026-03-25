package Day63;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		while (t-- > 0) {
			int a = reader.nextInt();
			int b = reader.nextInt();
			int c = reader.nextInt();
			if(a<b&&b<c) {
				System.out.println("STAIR");
			}else if(a<b&&b>c) {
				System.out.println("PEAK");
			}else {
				System.out.println("NONE");
			}
		}

		reader.close();
	}

}
