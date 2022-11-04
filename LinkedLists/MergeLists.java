package LinkedLists;

import JavaClasses.ListNode;

public class MergeLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tmp = new ListNode();
        ListNode head = tmp;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tmp.next = list1;
                list1 = list1.next;
            } else {
                tmp.next = list2;
                list2 = list2.next;
            }
            tmp = tmp.next;
        }
        if (list1 != null) {
            tmp.next = list1;
        } else {
            tmp.next = list2;
        }
        return head.next;
    }
}