package Day103;

import java.util.Scanner;

public class Demo18 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		char[] chs = reader.nextLine().toCharArray();
		char temp = chs[0];
		chs[0] = chs[1];
		chs[1] = temp;
		String ans = new String(chs);
		System.out.println(ans);

		reader.close();
	}

}
