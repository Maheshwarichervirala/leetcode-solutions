class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }
    public void solve(int[] arr, int target, int idx,
                      List<Integer> list, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            list.add(arr[i]);
            solve(arr, target - arr[i], i, list, ans);
            list.remove(list.size() - 1);
        }
    }
}