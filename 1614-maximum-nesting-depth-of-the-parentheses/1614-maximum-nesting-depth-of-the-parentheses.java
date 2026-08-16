class Solution {
    public int maxDepth(String s) {
        int count=0;
        int max=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                count++;
                max=Math.max(max,count);
            }
            else if(ch==')')
            {
                count--;
            }
            
        }
        return max;
    }
}