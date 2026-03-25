package Day145;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {

	class LRUCache {

		private class DoubleNode {
			private int key;
			private int val;
			private DoubleNode last;
			private DoubleNode next;

			private DoubleNode(int key, int val) {
				this.key = key;
				this.val = val;
			}

		}

		private class DoubleList {
			private DoubleNode head;
			private DoubleNode tail;

			private DoubleList() {
				head = null;
				tail = null;
			}

			private void addNode(DoubleNode newNode) {
				if (newNode == null) {
					return;
				}
				if (head == null) {
					head = newNode;
					tail = newNode;
				} else {
					tail.next = newNode;
					newNode.last = tail;
					tail = newNode;
				}
			}

			private void moveNodeToTail(DoubleNode node) {
				if (tail == node) {
					return;
				}
				if (head == node) {
					head = node.next;
					head.last = null;
				} else {
					node.last.next = node.next;
					node.next.last = node.last;
				}
				node.last = tail;
				node.next = null;
				tail.next = node;
				tail = node;
			}

			private DoubleNode removeHead() {
				if (head == null) {
					return null;
				}
				DoubleNode ans = head;
				if (head == tail) {
					head = null;
					tail = null;
				} else {
					head = ans.next;
					ans.next = null;
					head.last = null;
				}
				return ans;
			}

		}

		private Map<Integer, DoubleNode> keyNodeMap;

		private DoubleList nodeList;

		private final int capacity;

		public LRUCache(int capacity) {
			keyNodeMap = new HashMap<>();
			nodeList = new DoubleList();
			this.capacity = capacity;
		}

		public int get(int key) {
			if (keyNodeMap.containsKey(key)) {
				DoubleNode ans = keyNodeMap.get(key);
				nodeList.moveNodeToTail(ans);
				return ans.val;
			}
			return -1;
		}

		public void put(int key, int value) {
			if (keyNodeMap.containsKey(key)) {
				DoubleNode node = keyNodeMap.get(key);
				node.val = value;
				nodeList.moveNodeToTail(node);
			} else {
				if (keyNodeMap.size() == capacity) {
					keyNodeMap.remove(nodeList.removeHead().key);
				}
				DoubleNode newNode = new DoubleNode(key, value);
				keyNodeMap.put(key, newNode);
				nodeList.addNode(newNode);
			}
		}
	}

}
