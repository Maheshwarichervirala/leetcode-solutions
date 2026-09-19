class Solution {
    public int minStartValue(int[] nums) {
        int sum=0;
        int min=0;
        for(int i=0;i<=nums.length-1;i++)
        {
            sum=sum+nums[i];
            min=Math.min(min,sum);
        }
        
        return 1-min;
    }
}