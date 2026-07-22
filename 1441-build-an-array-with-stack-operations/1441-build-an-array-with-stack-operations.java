class Solution {
    public List<String> buildArray(int[] target, int n) {

        List<String> ans = new ArrayList<>();

        int index = 0;

        for (int num = 1; num <= n && index < target.length; num++) {

            ans.add("Push");

            if (num == target[index]) {
                index++;
            } else {
                ans.add("Pop");
            }
        }

        return ans;
    }
}