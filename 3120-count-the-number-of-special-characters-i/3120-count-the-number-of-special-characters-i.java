class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;

        int[] lowercase = new int[26];
        int[] uppercase = new int[26];

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isLowerCase(ch)) {
                lowercase[ch - 'a'] = 1;
            } else {
                uppercase[ch - 'A'] = 1;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (lowercase[i] == 1 && uppercase[i] == 1) {
                count++;
            }
        }

        return count;
    }
}