class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        ArrayList<Integer> missing = new ArrayList<>();

        int index = nums[0];

        for (int i = 0; i < nums.length; i++) {
            while (index < nums[i]) {
                missing.add(index);
                index++;
            }

            index++;
        }

        return missing;
    }
}