class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        long sum = 0;
        long max = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        if (map.size() == k) {
            max = sum;
        }
        for (int j = k; j < nums.length; j++) {
            sum += nums[j];
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            sum -= nums[j - k];
            map.put(nums[j - k], map.get(nums[j - k]) - 1);

            if (map.get(nums[j - k]) == 0) {
                map.remove(nums[j - k]);
            }
            if (map.size() == k) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}