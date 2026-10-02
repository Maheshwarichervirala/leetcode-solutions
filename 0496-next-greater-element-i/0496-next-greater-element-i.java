import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        Stack<Integer> s = new Stack<>();

        s.push(nums2[nums2.length - 1]);
        hm.put(nums2[nums2.length - 1], -1);

        for (int i = nums2.length - 2; i >= 0; i--) {

            while (!s.isEmpty() && s.peek() <= nums2[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                hm.put(nums2[i], -1);
            } else {
                hm.put(nums2[i], s.peek());
            }

            s.push(nums2[i]);
        }

        int[] answer = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            answer[i] = hm.get(nums1[i]);
        }

        return answer;
    }
}