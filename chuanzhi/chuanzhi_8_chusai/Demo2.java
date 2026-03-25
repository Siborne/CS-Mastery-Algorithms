package chuanzhi_8_chusai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo2 {

	private static List<Long> list = new ArrayList<>();

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String line = reader.nextLine();
		for (int i = 0, j = 1; i < line.length(); i += j, j = j == 11 ? 1 : j + 1) {
			if (i + j > line.length()) {
				break;
			}
//			System.out.println("1");
			int start = i;
			int end = i + j;

//			System.out.println("start:" + start + " end:" + end);
			long temp = 0;
			while (start < end) {
				temp <<= 1;
//				System.out.println("");
				temp += line.charAt(start) - '0';
				start++;
			}
			list.add(temp);
		}
		System.out.println(list.size());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			if (i > 0) {
				sb.append(" ");
			}
			sb.append(list.get(i));
		}
		System.out.println(sb.toString());
		reader.close();
	}

}
