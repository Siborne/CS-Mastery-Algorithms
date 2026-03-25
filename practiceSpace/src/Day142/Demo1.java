package Day142;

public class Demo1 {

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

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head.next == null) {
			return null;
		}
		ListNode fast = head;
		ListNode slow = head;
		ListNode slowPre = null;
		while (n-- > 0) {
			fast = fast.next;
		}
		while (fast!=null) {
			fast = fast.next;
			slowPre = slow;
			slow = slow.next;
		}
		if (slowPre == null) {
			return slow.next;
		}
		slowPre.next = slow.next;
		return head;
	}
}
