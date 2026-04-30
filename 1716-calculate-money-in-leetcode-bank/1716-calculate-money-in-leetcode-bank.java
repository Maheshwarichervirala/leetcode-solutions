class Solution {
    public int totalMoney(int n) {
        return helper(n, 0, 1);
    }

    private int helper(int n, int week, int day) {
        if (n == 0) return 0;

        int today = week + day;

        if (day == 7) {
            return today + helper(n - 1, week + 1, 1);
        } else {
            return today + helper(n - 1, week, day + 1);
        }
    }
}