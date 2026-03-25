package Day138;

public class Demo5 {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}
		ListNode a = headA;
		ListNode b = headB;
		int diff = 0;
		while (a.next != null) {
			a = a.next;
			diff++;
		}
		while (b.next != null) {
			b = b.next;
			diff--;
		}
		if (a != b) {
			return null;
		}
		if (diff >= 0) {
			a = headA;
			b = headB;
		} else {
			a = headB;
			b = headA;
		}
		diff = Math.abs(diff);
		while (diff-- > 0) {
			a = a.next;
		}
		while (a != b) {
			a = a.next;
			b = b.next;
		}
		return a;
	}

}
