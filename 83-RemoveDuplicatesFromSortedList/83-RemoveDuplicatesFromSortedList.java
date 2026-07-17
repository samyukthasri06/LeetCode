// Last updated: 7/17/2026, 3:16:43 PM
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;

        while (current != null && current.next != null) {

            if (current.val == current.next.val) {
                current.next = current.next.next; // remove duplicate
            } else {
                current = current.next; // move forward
            }
        }

        return head;
    }
}