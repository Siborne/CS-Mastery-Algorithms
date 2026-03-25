package Day87;

public class Demo8 {

	public ListNode partition(ListNode head, int x) {
		ListNode smallHead = null;
		ListNode smallTail = null;
		ListNode bigHead = null;
		ListNode bigTail = null;
		while (head != null) {
			if (head.val < x) {
				if (smallHead == null) {
					smallHead = head;
					smallTail = head;
					head = head.next;
					smallTail.next = null;
				} else {
					smallTail.next = head;
					smallTail = head;
					head = head.next;
					smallTail.next = null;
				}
			} else {
				if (bigHead == null) {
					bigHead = head;
					bigTail = head;
					head = head.next;
					bigTail.next = null;
				} else {
					bigTail.next = head;
					bigTail = head;
					head = head.next;
					bigTail.next = null;
				}
			}

		}
		if (smallHead == null) {
			return bigHead;
		}
		smallTail.next = bigHead;
		return smallHead;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}
