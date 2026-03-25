package Day123;

import java.util.Arrays;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while (reader.hasNextLine()) {
			char[] chs = new char[3];
			chs = reader.nextLine().toCharArray();
			Arrays.sort(chs);
			StringBuilder sb = new StringBuilder();
			for (char c : chs) {
				sb.append(c).append(" ");
			}
			System.out.println(sb.toString());
		}
		
		reader.close();
	}
	
}
