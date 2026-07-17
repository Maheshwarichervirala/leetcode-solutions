class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = -1;
        int high = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                low = i;
                break;
            }
        }

        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] == target) {
                high = j;
                break;
            }
        }

        return new int[]{low, high};
    }
}