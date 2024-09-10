package com.gyakhoe.algomap.easy;

import com.gyakhoe.util.ListNode;

public class LinkedListCycleSolution {


    public boolean hasCycle(ListNode head) {
        ListNode dummy = new ListNode();
        dummy = head;
        ListNode fast = dummy, slow = dummy;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast) {
                return true;
            }
        }
        return false;

    }
}
