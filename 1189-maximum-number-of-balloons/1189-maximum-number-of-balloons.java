class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] counting = new int[26];
        for (char c : text.toCharArray()) {
            counting[c - 'a']++;
        }
        int b = counting['b' - 'a'];
        int a = counting['a' - 'a'];
        int l = counting['l' - 'a'] / 2;
        int o = counting['o' - 'a'] / 2;
        int n = counting['n' - 'a'];

        return Math.min(b, 
               Math.min(a, 
               Math.min(l, 
               Math.min(o, n))));
    }
}