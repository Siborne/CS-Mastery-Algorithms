package Day103;

import java.util.Scanner;

public class Demo21 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		char[] chs = reader.nextLine().toCharArray();
		int l = 0;
		int r = chs.length - 1;
		while (l<=r) {
			if(chs[l++]!=chs[r--]) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
		reader.close();
	}

}
