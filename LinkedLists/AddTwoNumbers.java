package LinkedLists;
import JavaClasses.ListNode;
public class AddTwoNumbers {
    public ListNode addNums(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l1;
        }

        int sum = l1.val + l2.val;

        if (sum >= 10) {
            l2.next.val += 1;
        }

        return addNums(l1.next, l2.next);
    }
}
