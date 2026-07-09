class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int left = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            if (right >= k - 1) {

                maxSum = Math.max(maxSum, sum);

                sum -= nums[left];
                left++;
            }
        }

        return (double) maxSum / k;
    }
}