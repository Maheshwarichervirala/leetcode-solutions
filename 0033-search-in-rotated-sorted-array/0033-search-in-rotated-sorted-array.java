class Solution {
    public int search(int[] nums, int target) {
        
        int num = -1;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == target) {
                num = i;
                break;
            }
        }

        return num;
    }
}