package Day119;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		long n = reader.nextLong();
		long x = reader.nextLong();
		long cnt = 0;
		for (int i = 0; i < n; i++) {
			char c = reader.next().charAt(0);
			long d = reader.nextLong();
			if (c == '+') {
				x += d;
			} else {
				if (x >= d) {
					x -= d;
				} else {
					cnt++;
				}
			}
		}
        
        
		System.out.println(x + " " + cnt);
		reader.close();
	}

}
