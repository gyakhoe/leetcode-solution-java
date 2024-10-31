package com.gyakhoe.algomap.hard;

import com.gyakhoe.util.ListNode;

import java.util.PriorityQueue;
import java.util.Queue;

public class MergeKSortedLinkedLIstSolution {

    public ListNode mergeKList(ListNode[] lists) {

        Queue<ListNode> heap = new PriorityQueue<>(
                (a, b) -> Integer.compare(a.val, b.val)
        );

        for(ListNode node: lists) {
            if(node != null) {
                heap.offer(node);
            }
        }

        ListNode result = new ListNode();
        ListNode temp = result;

        while(!heap.isEmpty()) {
            ListNode node = heap.poll();
            temp.next = node;
            temp = node;
            if(node.next != null) {
                heap.offer(node.next);
            }
        }
        return  result;
    }

}
