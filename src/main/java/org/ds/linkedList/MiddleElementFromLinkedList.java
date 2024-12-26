package org.ds.linkedList;

public class MiddleElementFromLinkedList {


    public ListNode middle(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        while (slow !=null && fast !=null){

            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {

    }
}
