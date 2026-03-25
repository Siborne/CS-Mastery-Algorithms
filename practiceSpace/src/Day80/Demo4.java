package Day80;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int l = reader.nextInt();
			int r = reader.nextInt();
			if(l*2>r) {
				System.out.println("-1 -1");
			}else {
				System.out.println(l+" "+2*l);
			}
		}

		reader.close();
	}

}
