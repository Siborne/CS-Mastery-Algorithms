package Day120;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			Set<Integer> set = new HashSet<>();
			while (n-- > 0) {
				set.add(reader.nextInt());
			}
			System.out.println(set.size() * 2 - 1);
		}

		reader.close();
	}

}
