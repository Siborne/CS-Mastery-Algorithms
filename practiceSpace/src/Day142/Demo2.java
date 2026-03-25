package Day142;

import Day142.Demo2.ListNode;

public class Demo2 {

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

	public ListNode swapPairs(ListNode head) {
		ListNode dummyNode = new ListNode(0);
		dummyNode.next = head;
		ListNode temp = dummyNode;
		while (temp.next != null && temp.next.next != null) {
			ListNode odd = temp.next;
			ListNode even = temp.next.next;
			odd.next = even.next;
			temp.next = even;
			even.next = odd;
			temp = odd;
		}
		return dummyNode.next;
	}

}
