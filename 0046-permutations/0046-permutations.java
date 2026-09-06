import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generate(nums, 0, result);
        return result;
    }

    private void generate(int[] nums, int currentIndex, List<List<Integer>> result) {
        if (currentIndex == nums.length - 1) {
            List<Integer> currentPermutation = new ArrayList<>();
            for (int num : nums) {
                currentPermutation.add(num);
            }
            result.add(currentPermutation);
            return;
        }

        for (int i = currentIndex; i < nums.length; i++) {
            swap(nums, currentIndex, i);
            generate(nums, currentIndex + 1, result);
            swap(nums, currentIndex, i);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
