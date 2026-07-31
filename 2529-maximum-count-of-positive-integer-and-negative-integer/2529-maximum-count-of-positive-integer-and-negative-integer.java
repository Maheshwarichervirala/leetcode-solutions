class Solution {
    public int maximumCount(int[] nums) {
        int positivecount=0;
        int negativecount =0;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                negativecount++;
            }
            else if(nums[i]>0)
            {
                positivecount++;
            }
            
        }
        return Math.max(positivecount,negativecount);
    }
}