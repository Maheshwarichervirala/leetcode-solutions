class Solution {
    public int findKthPositive(int[] arr, int k) {
        int current=1;
        int missingcount=0;
        int i=0;
        while(missingcount<k)
        {
            if(i<arr.length&&arr[i]==current)
            {
                i=i+1;
            }
            else
            {
                missingcount=missingcount+1;
                if(missingcount==k)
                {
                    return current;
                }

            }
            current=current+1;
        }
        return -1;
    }
}