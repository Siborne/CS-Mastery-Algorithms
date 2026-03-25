package LGR_233_Div4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int x = reader.nextInt();
		int y = reader.nextInt();

		long ans = x;
		List<Node> list = new ArrayList<>();
		
		for(int i = 0;i<n;i++) {
			int a = reader.nextInt();
			int b = reader.nextInt();
			list.add(new Node(a,b));
		}
		
//		Collections.sort(list,(o1,o2)->{
//			if(o1.a==o2.a) {
//				return Integer.compare(o2.b, o1.b);
//			}else {
//				return Integer.compare(o1.a, o2.a);
//			}
//		});
		
//		for(Node node:list) {
//			System.out.println(node+": "+node.a+" "+node.b);
//		}
		
		int index = 0;
		while(ans<y&&index<list.size()) {
			Node node = list.get(index);
			if(ans<node.a) {
				break;
			}else {
				ans-=node.a;
				ans+=node.b;
			}
			index++;
		}
		
		System.out.println(ans);
		reader.close();
	}

	private static class Node {
		private int a;
		private int b;

		private Node(int a, int b) {
			this.a = a;
			this.b = b;
		}

		private Node() {
		}

	}

}
