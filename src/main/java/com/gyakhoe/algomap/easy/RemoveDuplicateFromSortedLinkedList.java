package com.gyakhoe.algomap.easy;



 // Definition for singly-linked list.
  class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


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
