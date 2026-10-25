
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<>();

        ListNode current = head;

        while (current != null) {
            if (visited.contains(current)) {
                return current;
            }

            visited.add(current);
            current = current.next;
        }

        return null;
    }
}
