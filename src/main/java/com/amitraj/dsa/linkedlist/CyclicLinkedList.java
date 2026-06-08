package main.java.com.amitraj.dsa.arrays;

public class CyclicLinkedList
{
    private Node head;

    CyclicLinkedList (Node head){
        this.head = head;
    }

    private class Node {
        int value;
        Node next;

        Node (int value){
            this.value = value;
            this.next = null;
        }

    }

    boolean hasCyle(){
        if (head==null || head.next==null)
            return false;

        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow ==fast)
                return true;
        }

        return false;
    }

}
