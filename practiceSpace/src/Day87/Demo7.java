package Day87;

import java.util.Scanner;

public class Demo7 {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = null;
		ListNode cur = null;
		int tempCarry = 0;
		for (int sum, val; l1 != null
				|| l2 != null; l1 = l1 == null ? null : l1.next, l2 = l2 == null ? null : l2.next) {
			int value1 = l1 == null ? 0 : l1.val;
			int value2 = l2 == null ? 0 : l2.val;
			sum = tempCarry + value1 + value2;
			val = sum % 10;
			tempCarry = sum / 10;
			if (head == null) {
				head = new ListNode(val);
				cur = head;
			} else {
				cur.next = new ListNode(val);
				cur = cur.next;
			}
		}
		if(tempCarry==1) {
			cur.next = new ListNode(1);
		}

		return head;
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
