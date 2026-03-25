package Day139;

public class Demo14 {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode detectCycle(ListNode head) {
		if (head == null || head.next == null || head.next.next == null) {
			return null;
		}
		ListNode slow = head.next;
		ListNode fast = head.next.next;
		while (slow != fast) {
			if (fast == null || fast.next == null) {
				return null;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		fast = head;
		while (slow != fast) {
			fast = fast.next;
			slow = slow.next;
		}
		return fast;
	}

}
