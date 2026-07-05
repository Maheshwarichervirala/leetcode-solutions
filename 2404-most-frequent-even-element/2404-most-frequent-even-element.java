import java.util.HashMap;

class Solution {
    public int mostFrequentEven(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            }
        }
        int ans = -1;
        int maxFreq = 0;
        for (int key : hm.keySet()) {
            int freq = hm.get(key);

            if (freq > maxFreq || (freq == maxFreq && key < ans)) {
                maxFreq = freq;
                ans = key;
            }
        }
        return ans;
    }
}