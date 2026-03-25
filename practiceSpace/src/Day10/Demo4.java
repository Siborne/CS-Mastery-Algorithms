package Day10;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String str = reader.nextLine();
		char[] chs = str.toCharArray();
		int l = 0;
		int r = str.length()-1;
		while(l<=r) {
			if(chs[l]!=chs[r]) {
				System.out.println("N");
				return;
			}
			l++;
			r--;
		}
		System.out.println("Y");
	}

}
