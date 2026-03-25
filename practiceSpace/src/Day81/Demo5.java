package Day81;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			List<Node> list = new ArrayList<>();
			for (int i = 1; i <= n; i++) {
				int a = reader.nextInt();
				int b = reader.nextInt();
				if (a <= 10) {
					list.add(new Node(a, b,i));
				}
			}	
			Collections.sort(list,(o1,o2)->{
				return Integer.compare(o2.b, o1.b);
			});
			System.out.println(list.get(0).index);
		}

		reader.close();
	}

	private static class Node {
		private int index;
		private int a;
		private int b;

		private Node(int a, int b,int index) {
			this.a = a;
			this.b = b;
			this.index = index;
		}
	}

}
