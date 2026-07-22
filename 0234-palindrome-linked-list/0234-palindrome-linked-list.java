/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode prev = null;
        ListNode curr = slow;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        
        ListNode firstHalfPointer = head;
        ListNode secondHalfPointer = prev; 
        while (secondHalfPointer != null) {
            if (firstHalfPointer.val != secondHalfPointer.val) {
                return false;
            }
            firstHalfPointer = firstHalfPointer.next;
            secondHalfPointer = secondHalfPointer.next;
        }
        
        return true;
    }
}
