package Day87;

import java.util.Stack;

public class Demo11 {

	class MinStack {

		/** initialize your data structure here. */
		Stack<Integer> data;
		Stack<Integer> minValue;

		public MinStack() {
			data = new Stack<>();
			minValue = new Stack<>();
		}

		public void push(int x) {
			data.push(x);
			if (minValue.isEmpty()) {
				minValue.push(x);
			} else {
				int temp = minValue.peek();
				minValue.push(temp <= x ? temp : x);
			}
		}

		public void pop() {
			if (!data.isEmpty()) {
				minValue.pop();
				data.pop();
			}
		}

		public int top() {
			return data.peek();
		}

		public int getMin() {
			return minValue.peek();
		}
	}

	/**
	 * Your MinStack object will be instantiated and called as such: MinStack obj =
	 * new MinStack(); obj.push(x); obj.pop(); int param_3 = obj.top(); int param_4
	 * = obj.getMin();
	 */
	
	

}
