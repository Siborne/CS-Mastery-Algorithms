package Day10;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		int n = reader.nextInt();
		for(int i = 0;i<n;i++) {
			queue.add(reader.nextInt());
		}
		int ans = 0;
		while(queue.size()>1) {
			int a = queue.poll();
			int b = queue.poll();
			int c = a+b;
			ans+=c;
			queue.add(c);
		}
		System.out.println(ans);
	}

}
