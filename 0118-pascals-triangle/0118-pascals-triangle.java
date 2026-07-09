import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            long val = 1; 
            row.add(1);

            for (int k = 1; k <= i; k++) {
                val = val * (i - k + 1) / k;
                row.add((int) val);
            }

            result.add(row);
        }

        return result;
    }
}