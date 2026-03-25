package Day42;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo13 {

	private static Map<Integer, Node> map = new HashMap<>();
	private static Node head;
	private static Node tail;
	private static long count;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		while (n-- > 0) {
			int x = reader.nextInt();
			add(x);
			System.out.println(count);
		}

		reader.close();
	}

	private static void add(int n) {
		if (map.containsKey(n)) {
			Node node = map.get(n);
			if (node.pre != null) {
				if ((node.pre.value + node.value) % 2 == 1) {
					count--;
				}
			}

			if (node.next != null) {
				if ((node.next.value + node.value) % 2 == 1) {
					count--;
				}
			}

			if (node.pre != null && node.next != null) {
				if ((node.pre.value + node.next.value) % 2 == 1) {
					count++;
				}
			}

			if (node.pre != null) {
				node.pre.next = node.next;
			} else {
				head = node.next;
			}
			if(node.next!=null) {
				node.next.pre = node.pre;
			}else {
				tail = node.pre;
			}
			map.remove(n);
		}
		Node newNode = new Node(n);
		if(tail!=null) {
			tail.next = newNode;
			newNode.pre = tail;
			if((tail.value + n)%2==1) {
				count++;
			}
		}else {
			head = newNode;
		}
		tail = newNode;
		map.put(n, newNode);
	}

	private static class Node {
		int value;
		Node pre;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}
}
