package g2025;

import java.util.PriorityQueue;
import java.util.Scanner;

public class T10 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int k = reader.nextInt();

		PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> Integer.compare(o2, o1));
		for(int i = 0;i<n;i++) {
			int x = reader.nextInt();
			queue.add(x);
		}
		for(int i = 0;i<k;i++) {
			int x = queue.poll();
			x/=2;
			queue.add(x);
		}
		long ans = 0;
		for(int a:queue) {
			ans+=a;
		}
		System.out.println(ans);
		reader.close();
	}

}
