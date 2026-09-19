class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] left = new int[nums.length];
         int [] right = new int[nums.length];
        int totalsum=0;
        for(int i=0;i<nums.length;i++)
        {
            totalsum=totalsum+nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            int rightsum=0;
            
            for(int j=i+1;j<nums.length;j++)
            {
                rightsum=rightsum+nums[j];
            }
            right[i]=rightsum;
            int leftsum=totalsum-rightsum-nums[i];
            left[i]=leftsum;
        }
        int [] ans= new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int abs=Math.abs(right[i]-left[i]);
            ans[i]=abs;
        }
        return ans;
        
    }
}