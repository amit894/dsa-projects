package main.java.com.amitraj.dsa.arrays;

public class MiddleLinkedList {

    Node head;

    private class Node {
        int value;
        Node next;

        Node (int value){
            this.value = value;
        }

    }

    Node middleLinkedList(){
        if (head==null)
            return null;
        if (head.next==null)
            return head;
        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null ){
            slow=slow.next;
            fast = fast.next.next;
        }

        head = slow;
        return head;

    }


}
