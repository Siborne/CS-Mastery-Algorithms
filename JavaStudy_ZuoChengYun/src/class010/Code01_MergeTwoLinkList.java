package class010;

public class Code01_MergeTwoLinkList {

	/**
	 * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
	 *
	 * 
	 * @param pHead1 ListNode类
	 * @param pHead2 ListNode类
	 * @return ListNode类
	 */
	public ListNode Merge(ListNode pHead1, ListNode pHead2) {
		// write code here
		if (pHead1 == null || pHead2 == null) {
			return pHead1 == null ? pHead2 : pHead1;
		}
		ListNode head = pHead1.val <= pHead2.val ? pHead1 : pHead2;
		ListNode cur1 = head.next;
		ListNode cur2 = pHead1 == head ? pHead2 : pHead1;
		ListNode pre = head;
		while (cur1 != null && cur2 != null) {
			if (cur1.val <= cur2.val) {
				pre.next = cur1;
				cur1 = cur1.next;
			} else {
				pre.next = cur2;
				cur2 = cur2.next;
			}
			pre = pre.next;
		}
		pre.next = cur1 != null ? cur1 : cur2;
		return head;
	}

	public class ListNode {
		int val;
		ListNode next = null;

		public ListNode(int val) {
			this.val = val;
		}
	}

}
