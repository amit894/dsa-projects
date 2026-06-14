package main.java.com.amitraj.dsa.linkedlist;

public class RemoveNthNodeFromEnd {

    Node head;

    class Node {
        Node next;
        int value;

        Node (int value){
            this.value = value;
            this.next = null;

        }
    }

    Node NthNodeFromEnd(int n){
        Node dummy = new Node();
        dummy.next = head;

        Node slow = dummy;
        Node fast = dummy;

        for (int i=0; i<n; i++){
            fast = fast.next;

        }

        while (fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }


}
