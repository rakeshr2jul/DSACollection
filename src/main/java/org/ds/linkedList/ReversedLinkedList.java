package org.ds.linkedList;

public class ReversedLinkedList {


    public ListNode reverseList(ListNode head) {

        if(head !=null){
            return head;
        }

        ListNode preNode = null;
        ListNode currentNode = head;


        while ( currentNode !=null){
            ListNode nextNode = currentNode.next;
            currentNode.next = preNode;
            preNode =currentNode;
            currentNode = nextNode;

        }

       head = preNode;
        return head;
    }
    public static void main(String[] args) {

    }
}
