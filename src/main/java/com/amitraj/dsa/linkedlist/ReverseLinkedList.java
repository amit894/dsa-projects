package main.java.com.amitraj.dsa.arrays;

public class ReverseLinkedList {

    private Node head;

    ReverseLinkedList (){
        this.head = null;
    }

    private class Node {
        int value;
        Node next;


        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }



    Node reverseLinkedList(){
        if (head ==null)
            return null;
        if (head.next==null)
            return head;

        Node current = head;
        Node prev = null;

        while (current!=null){
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        head = prev;
        return head;

    }
}
