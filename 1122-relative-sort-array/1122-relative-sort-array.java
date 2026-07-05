import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : arr1) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        int[] ans = new int[arr1.length];
        int index = 0;
        for (int num : arr2) {
            int freq = hm.get(num);

            for (int i = 0; i < freq; i++) {
                ans[index++] = num;
            }

            hm.remove(num);
        }
        ArrayList<Integer> list = new ArrayList<>();

        for (int key : hm.keySet()) {
            list.add(key);
        }
        Collections.sort(list);
        for (int num : list) {
            int freq = hm.get(num);

            for (int i = 0; i < freq; i++) {
                ans[index++] = num;
            }
        }

        return ans;
    }
}