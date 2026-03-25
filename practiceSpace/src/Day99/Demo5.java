package Day99;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		while (t-- > 0) {
			String s1 = reader.next();
			String s2 = reader.next();
			char[] chs1 = s1.toCharArray();
			char[] chs2 = s2.toCharArray();
			int left = 0;
			while (left < s1.length() && chs1[left] == chs2[left]) {
				left++;
			}
			int right = s2.length() - 1;
			while (right >= 0 && chs1[right] == chs2[right]) {
				right--;
			}
			if (left == s1.length()) {
				System.out.println("Y");
			} else {
				boolean flag = true;
				int tempRight = right;
				while (left <= tempRight) {
					if (chs1[left] != chs2[right]) {
						System.out.println("N");
						flag = false;
						break;
					}
					left++;
					right--;
				}
				if (flag) {
					System.out.println("Y");
				}
			}
		}

		reader.close();
	}

}
