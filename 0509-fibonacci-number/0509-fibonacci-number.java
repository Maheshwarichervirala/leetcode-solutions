class Solution {
    public int fib(int n) {
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return fib1(n,dp);
    }
    public int fib1(int n,int []dp)
    {
        if (n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        if(dp[n] !=-1)
        {
            return dp[n];
        }
        dp[n]=fib1(n-1,dp)+fib1(n-2,dp);
        return dp[n];
    }
}