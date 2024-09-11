package com.gyakhoe.algomap.medium;

import com.gyakhoe.util.Node;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointerSolution {

    public Node copyRandomList(Node head) {

        if(head == null) return null;

        Map<Node, Node> oldToNewMap = new HashMap<>();
        Node current = head;

        while(current != null) {
            oldToNewMap.put(current, new Node(current.val));
            current = current.next;
        }

        // second pass for next and random
        current = head;
        while(current != null) {
            Node newNode = oldToNewMap.get(current);
            newNode.next = oldToNewMap.get(current.next);
            newNode.random = oldToNewMap.get(current.random);
            current = current.next;
        }

        return  oldToNewMap.get(head);

    }
}
