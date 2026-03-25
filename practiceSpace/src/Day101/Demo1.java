package Day101;

public class Demo1 {
	class Solution {
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

		public ListNode removeElements1(ListNode head, int val) {
			while (head != null && head.val == val) {
				head = head.next;
			}
			ListNode cur = head;
			while (cur != null && cur.next != null) {
				if (cur.next.val == val) {
					cur.next = cur.next.next;
				} else {
					cur = cur.next;
				}
			}
			return head;
		}

		public ListNode removeElements2(ListNode head, int val) {
			while (head != null && head.val == val) {
				head = head.next;
			}
			if (head == null) {
				return head;
			}
			ListNode pre = head;
			ListNode cur = head.next;
			while (cur != null) {
				if (cur.val == val) {
					pre.next = cur.next;
				} else {
					pre = cur;
				}
				cur = cur.next;
			}
			return head;
		}
		
		public ListNode removeElements3(ListNode head,int val) {
			ListNode dummy = new ListNode();
			dummy.next = head;
			
			ListNode cur = dummy;
			while(cur.next!=null) {
				if(cur.next.val==val) {
					cur.next = cur.next.next;
				}else {
					cur = cur.next;
				}
			}
			
			return dummy.next;
		}
		
		public ListNode removeElements4(ListNode head,int val) {
			if(head == null) {
				return head;
			}
			
			head.next = removeElements4(head.next, val);
			if(head.val==val) {
				return head.next;
			}
			
			return head;
		}
		
		
	}
}
