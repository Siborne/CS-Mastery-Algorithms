package Day85;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int a = reader.nextInt();
			int b = reader.nextInt();
			int c = reader.nextInt();
			if(((2 * b - c) > 0 && (2 * b - c) % a == 0) || (a + c) % (b * 2) == 0 || ((2 * b - a) > 0 && (2 * b - a) % c == 0)) //可以通过乘整数m变成算术级数的情况
				System.out.printf("YES\n");
			else //否则
				System.out.printf("NO\n");
		}

		reader.close();
	}

}
