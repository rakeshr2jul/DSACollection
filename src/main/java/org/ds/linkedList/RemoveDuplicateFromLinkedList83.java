package org.ds.linkedList;

public class RemoveDuplicateFromLinkedList83 {

    public ListNode deleteDuplicates(ListNode head) {

        if( head ==null)
            return head;
    //    ListNode head =node;

        while(head.next !=null){
            if(head.val ==head.next.val){
                head.next = head.next.next;
            }else{
                head =head.next ;
            }

        }
        return head;
    }
}
