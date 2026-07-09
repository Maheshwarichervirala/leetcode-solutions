import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm = new HashMap<>();
        HashMap<Character, Character> hm1 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (hm.containsKey(c1)) {
                if (hm.get(c1) != c2) {
                    return false;
                }
            } else {
                hm.put(c1, c2);
            }

            if (hm1.containsKey(c2)) {
                if (hm1.get(c2) != c1) {
                    return false;
                }
            } else {
                hm1.put(c2, c1);
            }
        }

        return true;
    }
}