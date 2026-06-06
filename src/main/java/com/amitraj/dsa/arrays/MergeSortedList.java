package main.java.com.amitraj.dsa.arrays;

public class MergeSortedList {

    Node head;

    MergeSortedList(Node head){
        this.head = head;
    }

    private class Node {
        int value;
        Node next;

        Node (int value){
            this.value = value;
        }

    }

    Node mergeTwoSortedLists(Node list1, Node list2){

        Node dummy = new Node(0);
        Node tail = dummy;

        while (list1 !=null && list2 !=null){
            if (list1.value <=list2.value){
                tail.next=list1;
                list1 = list1.next;
                tail = tail.next;

            }
            else if (list2.value <list1.value){
                tail.next=list2;
                list2 = list2.next;
                tail = tail.next;

            }

        }

        if (list1 !=null)
            tail.next=list1;

        if (list2 !=null)
            tail.next=list2;

        return dummy.next;

    }
}
