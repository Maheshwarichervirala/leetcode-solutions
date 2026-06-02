class Solution {
    public int findShortestSubArray(int[] nums) {

        HashMap<Integer, Integer> count = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();

        int degree = 0;
        int ans = nums.length;

        for (int i = 0; i < nums.length; i++) {

            if (!first.containsKey(nums[i])) {
                first.put(nums[i], i);
            }

            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);

            int freq = count.get(nums[i]);

            if (freq > degree) {
                degree = freq;
                ans = i - first.get(nums[i]) + 1;
            }
            else if (freq == degree) {
                ans = Math.min(ans,
                        i - first.get(nums[i]) + 1);
            }
        }

        return ans;
    }
}