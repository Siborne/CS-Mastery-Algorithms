package Day42;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		String strA = reader.nextLine();
		String strB = reader.nextLine();
		
		Deque<Character> qa = new LinkedList<>();
		Deque<Character> qb = new LinkedList<>();
		
		Deque<Character> stack = new LinkedList<>();
		boolean flag = true;
		
		for(int i = 0;i<strA.length();i++) {
			qa.add(strA.charAt(i));
		}
		
		for(int i = 0;i<strB.length();i++) {
			qb.add(strB.charAt(i));
		}
		
		while(!qa.isEmpty()&&!qb.isEmpty()) {
			if(flag) {
				if(stack!=null&&stack.contains(qa.peekFirst())){
					Character tp = qa.pollFirst();
					qa.addLast(tp);
					while(!stack.isEmpty()&&stack.peekLast()!=tp) {
						qa.addLast(stack.pollLast());
					}
					qa.add(stack.pollLast());
					flag = true;
				}else {
					stack.addLast(qa.pollFirst());
					flag = false;
				}
			}else {
				if(stack!=null&&stack.contains(qb.peekFirst())) {
					Character tp = qb.pollFirst();
					qb.addLast(tp);
					while(!stack.isEmpty()&&stack.peekLast()!=tp) {
						qb.addLast(stack.pollLast());
					}
					qb.addLast(stack.pollLast());
					flag = false;
				}else {
					stack.addLast(qb.pollFirst());
					flag = true;
				}
			}
		}
		
		if(qa.isEmpty()&&qb.isEmpty()) {
			System.out.println(-1);
		}else if(qa.isEmpty()) {
			while(!qb.isEmpty()) {
				System.out.print(qb.pollFirst());
			}
		}else if(qb.isEmpty()) {
			while(!qa.isEmpty()) {
				System.out.print(qa.pollFirst());
			}
		}
		
		
		reader.close();
	}
	
}
