class Solution {
    public boolean checkDivisibility(int n) {
        int orig=n;
        int digit=0;
        int sum=0;
        int prod=1;
        while(n>0)
        {
            digit=n%10;
            sum=sum+digit;
            prod=prod*digit;
            n=n/10;
        }
        if(orig%(sum+prod)==0)
        {
            return true;
        }
        return false;
    }
}