public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode first = head, last = head.next;
        first.next = swapPairs(last.next);
        last.next = first;
        return last;
    }
}
