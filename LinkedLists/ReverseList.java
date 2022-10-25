package LinkedLists;
import JavaClasses.ListNode;
//Reverse a Linked List
public class ReverseList {
    public ListNode reverseListRecursive(ListNode head) {
        
        if(head==null || head.next == null) return head; 
        
        ListNode nextNode = head.next;
        head.next = null;
        ListNode rest = reverseListRecursive(nextNode);
        nextNode.next = head;
        return rest;

    }
}
