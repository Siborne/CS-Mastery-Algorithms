package Day98;

import java.util.Arrays;
import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		char[] chs = reader.nextLine().toCharArray();
		Arrays.sort(chs);
		System.out.println(chs[chs.length - 1]);
		reader.close();
	}

}
