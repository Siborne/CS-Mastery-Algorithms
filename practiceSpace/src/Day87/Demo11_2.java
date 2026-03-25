package Day87;

import java.util.Stack;

public class Demo11_2 {

	class MinStack {

		/** initialize your data structure here. */
		private final int MAXN = 8001;

		private int[] data;
		private int[] minValue;
		private int size;

		public MinStack() {
			data = new int[MAXN];
			minValue = new int[MAXN];
			size = 0;
		}

		public void push(int x) {
			data[size] = x;
			if (size == 0 || x <= minValue[size - 1]) {
				minValue[size] = x;
			} else {
				minValue[size] = minValue[size - 1];
			}
			size++;
		}

		public void pop() {
			size--;
		}

		public int top() {
			return data[size - 1];
		}

		public int getMin() {
			return minValue[size - 1];
		}
	}

}
