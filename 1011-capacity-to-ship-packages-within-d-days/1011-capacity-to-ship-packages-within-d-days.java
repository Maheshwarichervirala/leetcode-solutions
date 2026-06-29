class Solution {

    int daysw(int[] weights, int capacity) {

        int days = 1;
        int currentLoad = 0;

        for (int w : weights) {

            if (currentLoad + w > capacity) {
                days++;
                currentLoad = w;
            } else {
                currentLoad += w;
            }
        }

        return days;
    }

    public int shipWithinDays(int[] weights, int days) {

        int left = Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).sum();

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (daysw(weights, mid) <= days) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}