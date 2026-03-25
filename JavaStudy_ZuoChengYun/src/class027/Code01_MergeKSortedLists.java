package class027;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 *   public ListNode(int val) {
 *     this.val = val;
 *   }
 * }
 */

public class Code01_MergeKSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode mergeKLists(ArrayList<ListNode> lists) {
		// write code here
		PriorityQueue<ListNode> heap = new PriorityQueue<>((o1, o2) -> o1.val - o2.val);
		for (ListNode e : lists) {
			if (e != null) {
				heap.add(e);
			}
		}
		if (heap.isEmpty()) {
			return null;
		}
		ListNode head = heap.poll();
		ListNode pre = head;
		if(pre.next!=null) {
			heap.add(pre.next);
		}
		while(!heap.isEmpty()) {
			ListNode cur = heap.poll();
			pre.next=cur;
			pre = cur;
			if(cur.next!=null) {
				heap.add(cur.next);
			}
		}
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
