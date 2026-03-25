package Day54;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int max = 0;
		int a = reader.nextInt();
		int b = reader.nextInt();
		int c = reader.nextInt();
		max = Math.max(max, a+b+c);
		max = Math.max(max, a*b+c);
		max = Math.max(max, a+b*c);
		max = Math.max(max, (a+b)*c);
		max = Math.max(max, a*(b+c));
		max = Math.max(max, a*b*c);
		System.out.println(max);
		reader.close();
	}
	
}
