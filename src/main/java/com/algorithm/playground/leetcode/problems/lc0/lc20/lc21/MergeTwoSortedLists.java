package com.algorithm.playground.leetcode.problems.lc0.lc20.lc21;

import com.algorithm.playground.leetcode.problems.utils.linkedlist.ListNode;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
 */
public class MergeTwoSortedLists {

	class Solution {
		public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
			ListNode curr = new ListNode(0);
			ListNode head = curr;
			while (l1 != null && l2 != null) {
				if (l1.val < l2.val) {
					curr.next = l1;
					l1 = l1.next;
				} else {
					curr.next = l2;
					l2 = l2.next;
				}
				curr = curr.next;
			}
			if (l1 != null) {
				curr.next = l1;
			} else if (l2 != null) {
				curr.next = l2;
			}
			return head.next;
		}
	}

}
