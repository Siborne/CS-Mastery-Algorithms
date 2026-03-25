package g2025;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class T5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();

		while (t-- > 0) {
			Set<Integer> set = new HashSet<>();
			int n = reader.nextInt();
			for (int i = 0; i < n; i++) {
				int x = reader.nextInt();
				set.add(x);
			}
			int ans = 0;
			while (set.contains(ans)) {
				ans++;
			}
			System.out.println(ans);
		}

		reader.close();
	}

}
