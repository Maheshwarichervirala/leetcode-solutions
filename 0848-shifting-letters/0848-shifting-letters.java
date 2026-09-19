class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] chars = s.toCharArray();
        long currentShift = 0; 
        int total=0;
        for (int i = shifts.length - 1; i >= 0; i--) {
            total = (total + shifts[i]) % 26;
            chars[i] +=total;
            if(chars[i]>'z')
            {
                chars[i]-=26;
            }
        }
        return new String(chars);
    }
}
