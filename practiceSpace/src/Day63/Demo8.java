package Day63;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		char[] chs = reader.nextLine().toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<chs.length;i++) {
			int digit = chs[i]-'0';
			if(i==0) {
				int invert = 9 - digit;
				if(invert==0) {
					sb.append(digit);
				}else {
					sb.append(Math.min(digit, invert));
				}
			}else {
				sb.append(Math.min(digit, 9-digit));
			}
		}
		System.out.println(sb.toString());
		reader.close();
	}

}
