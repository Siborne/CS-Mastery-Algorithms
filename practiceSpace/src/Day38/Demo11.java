package Day38;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

	private static void solve() {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int m = reader.nextInt();
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			a.add(reader.nextInt());
		}
		for (int i = 0; i < m; i++) {
			b.add(reader.nextInt());
		}

		reader.nextLine();
		char[] chs = reader.nextLine().toCharArray();
		int indexA = 0;
		int indexB = 0;
		for(int i = 0;i<chs.length;i++) {
			if(chs[i]=='0') {
				Integer minA = Collections.min(a);
				indexA = a.indexOf(minA);
				System.out.println("A"+(indexA+1));
				a.set(indexA, Integer.MAX_VALUE);
			}else {
				Integer maxB = Collections.max(b);
				indexB = b.indexOf(maxB);
				System.out.println("B"+(indexB+1));
				b.set(indexB,Integer.MIN_VALUE);
			}
		}
		System.out.println("E");
		reader.close();
	}

}
