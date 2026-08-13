class Solution {
    public int jump(int[] nums) {
        int countindex = 0;
        int farthestpos = 0;
        int index = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthestpos = Math.max(farthestpos, i + nums[i]);

            if (i == index) {
                countindex++;
                index = farthestpos;
            }
        }

        return countindex;
    }
}