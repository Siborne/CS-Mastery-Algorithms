package chuanzhi_8_chusai;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo6_3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Set<String> set = new HashSet<>();
		int res = 0;
		String s = reader.nextLine();
		int len = s.length();
		for (int start = 0; start < len - 1; start++) {
			for (int end = start + 1; end < len; end++) {
				String str = s.substring(start, end + 1);
				if (str.contains("r") && str.contains("e") && !str.contains("d")) {
					set.add(str);
					res++;
				}
			}
		}
//		System.out.println(set.size());
		System.out.println(res);
		reader.close();
	}

}
