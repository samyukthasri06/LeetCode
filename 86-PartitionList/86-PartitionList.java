// Last updated: 7/17/2026, 3:16:39 PM
class Solution {
    public ListNode partition(ListNode head, int x) {

        ListNode smaller = new ListNode(0);
        ListNode greater = new ListNode(0);

        ListNode small = smaller;
        ListNode great = greater;

        while (head != null) {

            if (head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                great.next = head;
                great = great.next;
            }

            head = head.next;
        }

        // End the greater list
        great.next = null;

        // Connect smaller list with greater list
        small.next = greater.next;

        return smaller.next;
    }
}