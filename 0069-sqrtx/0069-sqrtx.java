class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x; // handle 0 and 1
        
        int low = 1, high = x / 2;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid <= x / mid) {
                ans = mid;        // valid square root
                low = mid + 1;    // try bigger
            } else {
                high = mid - 1;   // go smaller
            }
        }

        return ans;
    }
}