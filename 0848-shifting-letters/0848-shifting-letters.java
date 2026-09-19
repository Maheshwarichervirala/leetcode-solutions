class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] chars = s.toCharArray();
        long currentShift = 0; 
        
        for (int i = shifts.length - 1; i >= 0; i--) {
            currentShift = (currentShift + shifts[i]) % 26;
            
            int newCharPos = (chars[i] - 'a' + (int) currentShift) % 26;
            chars[i] = (char) ('a' + newCharPos);
        }
        
        return new String(chars);
    }
}
