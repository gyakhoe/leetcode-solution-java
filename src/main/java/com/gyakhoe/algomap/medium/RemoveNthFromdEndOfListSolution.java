package com.gyakhoe.algomap.medium;

import com.gyakhoe.util.ListNode;

public class RemoveNthFromdEndOfListSolution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode();
        dummy.next  = head;
        ListNode ahead = dummy, behind = dummy;

        for(int i = 0; i <= n; i++) {
            ahead = ahead.next;
        }

        while(ahead != null) {
            ahead = ahead.next;
            behind = behind.next;
        }

        behind.next = behind.next.next;


        return dummy.next;
    }
}
