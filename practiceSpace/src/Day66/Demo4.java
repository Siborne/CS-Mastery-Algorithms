package Day66;

import java.util.Arrays;
import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		char[] chs = "Trumi".toCharArray();
		Arrays.sort(chs);
		String target = new String(chs);
		while (t-- > 0) {
			int n = reader.nextInt();
			reader.nextLine();
			char[] ch = reader.nextLine().toCharArray();
			Arrays.sort(ch);
			String str = new String(ch);
			if(n!=5) {
				System.out.println("NO");
				continue;
			}
			if(str.equals(target)) {
				System.out.println("YES");
				continue;
			}
			System.out.println("NO");
		}

		reader.close();
	}

}
