// Last updated: 7/17/2026, 3:16:03 PM
public class Solution {
    public boolean hasCycle(ListNode head) {

        // Empty list or single node cannot form a cycle
        if (head == null || head.next == null) {
            return false;
        }

        // Slow pointer moves 1 step
        ListNode slow = head;

        // Fast pointer moves 2 steps
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;          // Move 1 step
            fast = fast.next.next;     // Move 2 steps

            // If they meet, cycle exists
            if (slow == fast) {
                return true;
            }
        }

        // Fast reached end => No cycle
        return false;
    }
}