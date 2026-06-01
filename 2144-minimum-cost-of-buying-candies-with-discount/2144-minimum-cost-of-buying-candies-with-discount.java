import java.util.*;

class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n = cost.length;
        int total = 0;
        for (int i = n - 1; i >= 0; i--) {
            if ((n - 1 - i) % 3 == 2) continue;
            total += cost[i];
        }
        return total;
    }
}