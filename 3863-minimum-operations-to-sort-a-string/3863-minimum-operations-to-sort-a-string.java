import java.util.Arrays;

class Solution {
    public int minOperations(String s) {
        int n = s.length();
        
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String sortedStr = new String(arr);
        
        if (s.equals(sortedStr)) {
            return 0;
        }
        
        if (n == 2) {
            return -1;
        }
        
        if (s.charAt(0) == sortedStr.charAt(0) || s.charAt(n - 1) == sortedStr.charAt(n - 1)) {
            return 1;
        }
        
        char minChar = sortedStr.charAt(0);
        char maxChar = sortedStr.charAt(n - 1);
        
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == minChar || s.charAt(i) == maxChar) {
                return 2;
            }
        }
        
        if (s.charAt(0) == maxChar && s.charAt(n - 1) == minChar) {
            return 3;
        }
        
        return 2;
    }
}
