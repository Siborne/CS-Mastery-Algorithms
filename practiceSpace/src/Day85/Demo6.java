package Day85;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javafx.css.PseudoClass;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int m = reader.nextInt();
			String x = reader.next();
			String s = reader.next();
			if (x.contains(s)) {
				System.out.println(0);
				continue;
			}
			Set<Character> xChar = new HashSet<>();
			for (char c : x.toCharArray()) {
				xChar.add(c);
			}
			boolean possible = true;
			for (char c : s.toCharArray()) {
				if (!xChar.contains(c)) {
					possible = false;
					break;
				}
			}
			if (!possible) {
				System.out.println(-1);
				continue;
			}

			int opCount = 0;
			while(x.length()<1000) {
				opCount++;
				x = x+x;
				if(x.contains(s)) {
					System.out.println(opCount);
					break;
				}
			}
			if(!x.contains(s)) {
				System.out.println(-1);
				continue;
			}
		}

		reader.close();
	}

}
