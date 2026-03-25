package Day103;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String a = reader.nextLine();
		StringBuilder sb = new StringBuilder(a);
		String ans = sb.reverse().toString();
		System.out.println(ans);
		reader.close();
	}

}
