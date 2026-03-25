package chuanzhi_8_chusai;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo6_2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String s = reader.nextLine();
		String[] parts = s.split("d");
//		long ans = 0;
		Set<String> set = new HashSet<>();
		for (String part : parts) {
			if (part.length()<2) {
				continue;
			}
			for (int start = 0; start < part.length(); start++) {
				for (int end = start+1; end < part.length(); end++) {
					String str = part.substring(start,end+1);
					if (str.contains("r")&&str.contains("e")) {
						set.add(str);
					}
				}
			}
		}
//		for (String string : set) {
//			System.out.println(string);
//		}
		System.out.println(set.size());
		reader.close();
	}
	
}
