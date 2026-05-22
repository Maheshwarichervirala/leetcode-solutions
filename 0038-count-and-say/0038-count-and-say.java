class Solution {
    public String countAndSay(int n) {
        String result = "1";

        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int j = 0;

            while (j < result.length()) {
                int count = 1;

                // count consecutive same characters
                while (j + 1 < result.length() &&
                       result.charAt(j) == result.charAt(j + 1)) {
                    j++;
                    count++;
                }

                sb.append(count);
                sb.append(result.charAt(j));
                j++;
            }

            result = sb.toString();
        }

        return result;
    }
}