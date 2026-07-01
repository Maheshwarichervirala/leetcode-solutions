class Solution {
    public int findNumbers(int[] nums) {
        int count1 = 0;

        for (int i = 0; i < nums.length; i++) {
            int numscount = digitcount(nums[i]);
            if (numscount % 2 == 0) {
                count1++;
            }
        }

        return count1;
    }

    public int digitcount(int num) {
        int count = 1;

        while (num >= 10) {
            num = num / 10;
            count++;
        }

        return count;
    }
}