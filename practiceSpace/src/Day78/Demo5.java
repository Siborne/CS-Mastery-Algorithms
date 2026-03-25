package Day78;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			double a = reader.nextDouble();
			if(360.0/(180.0-a)==(int)(360/(180-a))) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}

		reader.close();
	}

}
