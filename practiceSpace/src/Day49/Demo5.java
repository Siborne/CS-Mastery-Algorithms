package Day49;

import java.util.LinkedList;
import java.util.Queue;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 1;i<=10;i++) {
			queue.add(i);
		}
		System.out.println(queue);
		System.out.println(queue.offer(1));
		System.out.println(queue);
	}

}
