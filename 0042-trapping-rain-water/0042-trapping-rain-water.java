class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left=1;
        int right=n-2;
        int lmax=height[left-1];
        int rmax=height[right+1];
        int result=0;
        while(left<=right)
        {
            int water;
            if(rmax<=lmax)
            {
                water=rmax-height[right];
                if (water>0)
                {
                    result=result+water;
                }
                rmax=Math.max(rmax,height[right]);
                right=right-1;
            }
            else{
                water=lmax-height[left];
                if(water>0)
                {
                    result=result+water;
                }
                lmax=Math.max(lmax,height[left]);
                left=left+1;
            }
            
        }
        return result;

    }
}