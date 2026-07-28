class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder firstHalf = new StringBuilder();
        char middle = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                middle = (char) (i + 'a');
            }

            for (int j = 0; j < freq[i] / 2; j++) {
                firstHalf.append((char) (i + 'a'));
            }
        }

        String secondHalf = new StringBuilder(firstHalf).reverse().toString();

        if (middle != 0) {
            return firstHalf.toString() + middle + secondHalf;
        }

        return firstHalf.toString() + secondHalf;
    }
}