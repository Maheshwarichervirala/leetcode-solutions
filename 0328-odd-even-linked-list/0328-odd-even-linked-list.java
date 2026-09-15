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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode oddDummy = new ListNode(0);
        ListNode evenDummy = new ListNode(0);
        ListNode oddCurr = oddDummy;
        ListNode evenCurr = evenDummy;
        ListNode temp = head;
        
        int count = 1; 
        while (temp != null) {
            if (count % 2 != 0) {
                oddCurr.next = temp;
                oddCurr = oddCurr.next;
            } else {
                evenCurr.next = temp;
                evenCurr = evenCurr.next;
            }
            
            temp = temp.next;
            count++;
        }
        evenCurr.next = null;
        oddCurr.next = evenDummy.next;
        return oddDummy.next;
    }
}
