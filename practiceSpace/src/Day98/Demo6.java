package Day98;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;


public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();
		int[] arr = new int[n];
		long[] brr = new long[n + 1];
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
			brr[i + 1] = arr[i] + brr[i];
		}
		
		Deque<Integer> queue = new LinkedList<>();
		queue.add(0);
		long ans = Long.MIN_VALUE;
		for(int i = 1;i<=n;i++) {
			while(!queue.isEmpty()&&i-queue.peekFirst()>m) {
				queue.pollFirst();
			}
			if(!queue.isEmpty()) {
				long temp = brr[i] - brr[queue.peekFirst()];
				if(temp>ans) {
					ans = temp;
				}
			}
			while(!queue.isEmpty()&&brr[i]<=brr[queue.peekLast()]) {
				queue.pollLast();
			}
			queue.addLast(i);
		}
		System.out.println(ans);
			
		
		reader.close();
	}

}
