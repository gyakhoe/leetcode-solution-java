package com.gyakhoe.algomap.easy;

import com.gyakhoe.util.ListNode;

public class MiddleLinkedListSolution {

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return  slow;
    }
}
