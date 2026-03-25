package Day87;

public class Demo12_2 {

	class MyCircularDeque {

		private int[] deque;
		private int size;
		private int limit;
		private int front;
		private int last;

		public MyCircularDeque(int k) {
			deque = new int[k];
			size = 0;
			front = 0;
			last = 0;
			limit = k;
		}

		public boolean insertFront(int value) {
			if (isFull()) {
				return false;
			} else {
				if (isEmpty()) {
					front = last = 0;
					deque[front] = value;
				} else {
					front = (front + limit - 1) % limit;
					deque[front] = value;
				}
				size++;
				return true;
			}
		}

		public boolean insertLast(int value) {
			if (isFull()) {
				return false;
			} else {
				if (isEmpty()) {
					last = front = 0;
					deque[last] = value;
				} else {
					last = (last + 1) % limit;
					deque[last] = value;
				}
				size++;
				return true;
			}
		}

		public boolean deleteFront() {
			if (isEmpty()) {
				return false;
			} else {
				front = (front + 1) % limit;
				size--;
				return true;
			}
		}

		public boolean deleteLast() {
			if (isEmpty()) {
				return false;
			} else {
				last = (last + limit - 1) % limit;
				size--;
				return true;
			}
		}

		public int getFront() {
			if(isEmpty()) {
				return -1;
			}else {
				return deque[front];
			}
		}

		public int getRear() {
			if(isEmpty()) {
				return -1;
			}else {
				return deque[last];
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
