import java.util.Arrays;

class Solution {
    public int findPairs(int[] nums, int k) {

        if (k < 0)
            return 0;

        Arrays.sort(nums);

        int left = 0;
        int right = 1;
        int count = 0;

        while (left < nums.length && right < nums.length) {

            if (left == right) {
                right++;
            }
            else {
                int diff = nums[right] - nums[left];

                if (diff < k) {
                    right++;
                }
                else if (diff > k) {
                    left++;
                }
                else {
                    count++;
                    left++;

                    while (left < nums.length &&
                           nums[left] == nums[left - 1]) {
                        left++;
                    }
                }
            }
        }

        return count;
    }
}