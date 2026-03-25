package Day134;

import java.util.Stack;

import Day134.Demo3.ListNode;

public class Demo4 {
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

	public boolean isPalindrome(ListNode head) {
		ListNode fast, slow;
		fast = slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		slow = reverseList(slow);
		ListNode node = head;
		boolean flag = true;
		while (slow != null) {
			if (slow.val != node.val) {
				flag = false;
				break;
			}
			slow = slow.next;
			node = node.next;
		}
		return flag;
	}

	private ListNode reverseList(ListNode head) {
		ListNode pre = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}

}
