class Solution {
    public int numberOfMatches(int n) {
       int  ma=0;
        while(n>1)
        {
            if(n%2==0)
            {
                ma=ma+n/2;
                n=n/2;
            }
            else{
                ma=ma+(n-1)/2;
                n=(n-1)/2+1;
            }
        }
        return ma;
    }
}