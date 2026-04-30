class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int D = 0;
        int E = 0;

        while (numBottles > 0) {
            D += numBottles;
            E += numBottles;
            numBottles = E / numExchange;
            E = E % numExchange;
        }

        return D;
    }
}