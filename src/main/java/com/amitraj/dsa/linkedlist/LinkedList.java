package main.java.com.amitraj.dsa.arrays;

public class LinkedList {

    Node head;

    private class Node {
        int value;
        Node next;

        Node (int value){
            this.value = value;
            this.next=null;
        }
    }



    void listTraversal(){
        if (head == null)
            return;
        Node current = head;
        while ( current!=null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    Node insertAtHead(Node newNode){
        newNode.next = head;
        head = newNode;
        return head;

    }

    Node insertAtTail(Node newNode){
        if (head==null){
            head =newNode;
            return head;
        }
        Node current = head;
        while (current.next!=null){
            current = current.next;
        }
        current.next = newNode;
        return head;

    }

    Node deleteNode (int value){

        if (head.value==value)
            return head.next;

        Node current = head;

        while (current.next!=null){
            if (current.next.value==value){
                current.next=current.next.next;
            }
            else {
                current=current.next;
            }

        }
        return head;

    }


}
