package Day87;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Demo12 {

	class MyCircularDeque {

		private Deque<Integer> deque;

		private int size;
		private int limit;

		public MyCircularDeque(int k) {
			deque = new LinkedList<>();
			size = 0;
			limit = k;
		}

		public boolean insertFront(int value) {
			if (isFull()) {
				return false;
			} else {
				deque.offerFirst(value);
				size++;
				return true;
			}
		}

		public boolean insertLast(int value) {
			if (isFull()) {
				return false;
			} else {
				deque.offerLast(value);
				size++;
				return true;
			}
		}

		public boolean deleteFront() {
			if (isEmpty()) {
				return false;
			} else {
				deque.pollFirst();
				size--;
				return true;
			}
		}

		public boolean deleteLast() {
			if (isEmpty()) {
				return false;
			} else {
				deque.pollLast();
				size--;
				return true;
			}
		}

		public int getFront() {
			if (isEmpty()) {
				return -1;
			} else {
				return deque.peekFirst();
			}
		}

		public int getRear() {
			if (isEmpty()) {
				return -1;
			} else {
				return deque.peekLast();
			}
		}

		public boolean isEmpty() {
			return size == 0;
		}

		public boolean isFull() {
			return size == limit;
		}
	}

	/**
	 * Your MyCircularDeque object will be instantiated and called as such:
	 * MyCircularDeque obj = new MyCircularDeque(k); boolean param_1 =
	 * obj.insertFront(value); boolean param_2 = obj.insertLast(value); boolean
	 * param_3 = obj.deleteFront(); boolean param_4 = obj.deleteLast(); int param_5
	 * = obj.getFront(); int param_6 = obj.getRear(); boolean param_7 =
	 * obj.isEmpty(); boolean param_8 = obj.isFull();
	 */

}
