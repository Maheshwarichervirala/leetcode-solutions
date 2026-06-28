class Solution {

    public int smallestDivisor(int[] nums, int threshold) {

        int low = 1;
        int high = 0;
        for (int num : nums) {
            high = Math.max(high, num);
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (sumByDivisor(nums, mid) <= threshold) {
                high = mid - 1;  
            } else {
                low = mid + 1;   
            }
        }

        return low;
    }
       private int sumByDivisor(int[] nums, int divisor) {
        int sum = 0;
        for (int num : nums) {
            sum += (int) Math.ceil((double) num / divisor);
        }
        return sum;
    }

}