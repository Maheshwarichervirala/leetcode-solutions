class Solution {
    public boolean lemonadeChange(int[] bills) {
        int ten=0;
        int five=0;
        for(int bill:bills)
        {
            if(bill==5)
            {
                five++;
            }
            else if(bill==10)
            {
                if(five>0)
                {
                    five--;
                    ten++;
                }
                else{
                    return false;
                }
            }
            else{
                if(ten>0&&five>0)
                {
                    ten = ten-1;
                    five=five-1;
                }
                else if(five>=3)
                {
                    five -=3;
                }
                else{
                    return false;
                }
            }
            
        }
        return true;
    }
}