package Day113;

import java.util.Arrays;
import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		reader.nextLine();
		String[] strs = reader.nextLine().split(" ");

		Arrays.sort(strs, (o1, o2) -> {
			String o1o2 = o1 + o2;
			String o2o1 = o2 + o1;
			return o2o1.compareTo(o1o2);
		});

		StringBuilder sb = new StringBuilder();
		for (String str : strs) {
			sb.append(str);
		}
		System.out.println(sb.toString());
		reader.close();
	}

}
