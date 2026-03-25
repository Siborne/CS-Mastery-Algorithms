package Day128;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo14 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		Set<Integer> odd = new HashSet<>();
		Set<Integer> even = new HashSet<>();

		int n = reader.nextInt();
		while (n-- > 0) {
			int x = reader.nextInt();
			if ((x & 1) == 1) {
				odd.add(x);
			} else {
				even.add(x);
			}
		}
		int ans = 0;
		if (odd.size() > even.size()) {
			for (int i = 1; i < Integer.MAX_VALUE; i += 2) {
				if (!odd.contains(i)) {
					ans = i;
					break;
				}
			}
		} else {
			for (int i = 2; i < Integer.MAX_VALUE; i += 2) {
				if (!even.contains(i)) {
					ans = i;
					break;
				}
			}
		}
		System.out.println(ans);

		reader.close();
	}

}
