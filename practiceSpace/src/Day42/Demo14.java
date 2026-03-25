package Day42;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo14 {

	private static long ans = 0;
	private static Node head;
	private static Node tail;
	private static Map<Integer, Node> map = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		while (n-- > 0) {
			int x = reader.nextInt();
			add(x);
			System.out.println(ans);
		}
		reader.close();
	}

	private static void add(int x) {
		if (map.containsKey(x)) {
			Node node = map.get(x);
			if (node.pre != null) {
				if ((node.pre.value + node.value) % 2 == 1) {
					ans--;
				}
			}

			if (node.next != null) {
				if ((node.next.value + node.value) % 2 == 1) {
					ans--;
				}
			}
			
			if(node.next!=null&&node.pre!=null) {
				if((node.next.value+node.pre.value)%2==1) {
					ans++;
				}
			}
			
			if(node.pre!=null) {
				node.pre.next = node.next;
			}else {
				head = node.next;
			}
			
			if(node.next!=null) {
				node.next.pre = node.pre;
			}else {
				tail = node.pre;
			}
			map.remove(x);
		}
		
		Node newNode = new Node(x);
		if(tail!=null) {
			tail.next=newNode;
			newNode.pre=tail;
			if((tail.value+newNode.value)%2==1) {
				ans++;
			}
		}else {
			head = newNode;
		}
		tail = newNode;
		map.put(x, newNode);

	}

	private static class Node {
		int value;
		Node pre;
		Node next;

		public Node(int value) {
			this.value = value;
		}
	}
}
