
class Solution {
    public void sortColors(int[] nums) {
        int z = 0;
        int o = 0;
        int t = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                z++;
            } else if (nums[i] == 1) {
                o++;
            } else {
                t++;
            }
        }

        int index = 0;

        for (int i = 0; i < z; i++) {
            nums[index++] = 0;
        }

        for (int i = 0; i < o; i++) {
            nums[index++] = 1;
        }

        for (int i = 0; i < t; i++) {
            nums[index++] = 2;
        }
    }
}
