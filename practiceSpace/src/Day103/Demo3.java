package Day103;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println(reader.nextInt());
		System.out.println(reader.nextLong());
		System.out.println(String.format("%.1f", reader.nextDouble()));
		System.out.println(reader.next());
		System.out.println(reader.next());
		reader.close();
	}
	
}
