package Day70;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			Set<Integer> set = new HashSet<>();
			for(int i = 0;i<n;i++) {
				int x = reader.nextInt();
				set.add(x);
			}
			if(n==set.size()) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}

		reader.close();
	}

}
