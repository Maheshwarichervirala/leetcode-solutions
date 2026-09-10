class Solution {
    public int fib(int n) {
        int fib2=0;
       int  fib1=1;
       if(n<=1)
       {
        return n;
       }
        for(int i =2;i<=n;i++)
        {
             int curr=fib1+fib2;
             fib2=fib1;
             fib1=curr;
        }
        return fib1;
    }
}