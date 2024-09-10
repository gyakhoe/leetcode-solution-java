package com.gyakhoe.algomap.easy;


import com.gyakhoe.util.ListNode;

public class RemoveDuplicateFromSortedLinkedList {

    public ListNode deleteDuplicate(ListNode head) {
        ListNode current = head;

        while(current != null && current.next != null) {
            if(current.val == current.next.val) {
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return head;
    }
}
