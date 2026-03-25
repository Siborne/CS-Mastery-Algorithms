package Day113;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(reader.nextLine());
		boolean flag = false;
		if (sb.charAt(0) == '-') {
			flag = true;
			sb = sb.delete(0, 1);
		}
		sb = sb.reverse();
		int i = 0;
		while (sb.charAt(i) == '0') {
			i++;
		}
		String res = sb.delete(0, i).toString();
		System.out.print(flag ? "-" : "");
		System.out.println(res);
		reader.close();
	}

}
