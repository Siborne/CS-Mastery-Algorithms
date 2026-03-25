package Day86;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		long a = reader.nextLong();
		long b = reader.nextLong();
		long ans = a*b;
		System.out.println(ans);
		reader.close();
	}
	
}
