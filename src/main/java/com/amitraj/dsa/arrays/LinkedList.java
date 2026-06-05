package main.java.com.amitraj.dsa.arrays;

public class LinkedList {

    private Node head;

    LinkedList (){
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

    void traverseList(){
        if (head == null){
            System.out.println("Empty List");
            return;
          }
        Node current = head;
        while (current !=null){
            System.out.println(current.value);
            current = current.next;
        }


    }
    void addNodeToList(int value){
        if (head == null){
            head = new Node(value);
            return;
        }
        Node current = head;
        while (current.next !=null){
            current = current.next;
        }
        current.next = new Node(value);
    }

    Node removeNodeFromList(int value){

        if (head==null){
            System.out.println("No element to delete");
            return null;
        }

        while (head != null && head.value == value) {
            head = head.next;
        }

        if (head == null)
            return null;

        Node current = head;

        while (current.next!=null ){
            if (current.next.value == value){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }

        }

        return head;

    }
}
