class Solution {
    public int hammingWeight(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int digit = n % 2;
            sb.append(digit);
            n = n / 2;
        }
        
        String numStr = sb.toString(); 
        int count = 0;
        
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) == '1') { 
                count++;
            }
        }
        return count;
    }
}
