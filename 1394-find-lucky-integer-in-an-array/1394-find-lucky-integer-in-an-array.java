class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

    for (int num : arr) {
        hm.put(num, hm.getOrDefault(num, 0) + 1);
    }

    int ans = -1;

    for (int key : hm.keySet()) {
        if (hm.get(key) == key) {
            ans = Math.max(ans, key);
        }
    }

    return ans;
    }
}