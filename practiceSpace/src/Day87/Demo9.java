package Day87;

import java.util.Stack;

public class Demo9 {

	class MyQueue {

		private Stack<Integer> in;
		private Stack<Integer> out;
		
		public MyQueue() {
			in = new Stack<>();
			out = new Stack<>();
		}

		public void push(int x) {
			in.add(x);
		}

		public int pop() {
			if(out.isEmpty()) {
				while(!in.isEmpty()) {
					out.add(in.pop());
				}
			}
			return out.pop();
		}

		public int peek() {
			if(out.isEmpty()) {
				while(!in.isEmpty()) {
					out.add(in.pop());
				}
			}
			return out.peek();
		}

		public boolean empty() {
			if(in.isEmpty()&&out.isEmpty()) {
				return true;
			}
			return false;
		}
	}

}
