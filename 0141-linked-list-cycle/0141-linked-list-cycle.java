public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            
            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps
            
            // cycle found
            if (slow == fast) {
                return true;
            }
        }
        
        // no cycle
        return false;
    }
}