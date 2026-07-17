// Last updated: 7/17/2026, 3:16:44 PM
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while (head != null) {

            // Check for duplicates
            if (head.next != null && head.val == head.next.val) {

                // Skip all nodes with the same value
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }

                prev.next = head.next;
            }
            else {
                prev = prev.next;
            }

            head = head.next;
        }

        return dummy.next;
    }
}