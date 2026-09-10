class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int [] ans=new int[n];
        for(int [] book:bookings)
        {
            int fis=book[0];
            int las=book[1];
            int seat=book[2];
            ans[fis-1]+=seat;
            if(las<n)
            {
                ans[las]-=seat;
            }
        }
        int [] anss=new int[n];
        anss[0]=ans[0];
        for(int i=1;i<n;i++)
        {
            anss[i]=ans[i]+anss[i-1];
        }
        return anss;
    }
}