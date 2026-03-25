package class034;

public class Code02_ReverseNodesInkGroup {

	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode start = head;
		ListNode end = teamEnd(k, start);
		if (end == null) {
			return head;
		}
		head = end;
		reverse(start, end);
		ListNode lastTeamEnd = start;
		while(lastTeamEnd.next!=null) {
			start = lastTeamEnd.next;
			end = teamEnd(k, start);
			if(end == null) {
				return head;
			}
			reverse(start, end);
			lastTeamEnd.next = end;
			lastTeamEnd = start;
		}
		return head;
	}

	private static void reverse(ListNode s, ListNode e) {
		e = e.next;
		ListNode pre = null, cur = s, next = null;
		while (cur != e) {
			next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		s.next = e;
	}

	private static ListNode teamEnd(int k, ListNode s) {
		while (--k != 0 && s.next != null) {
			s = s.next;
		}
		return s;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
}
